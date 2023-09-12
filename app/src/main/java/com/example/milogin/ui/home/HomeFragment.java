package com.example.milogin.ui.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.milogin.R;
import com.example.milogin.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private Context context;
    private Button btllamar;
    private HomeViewModel vm;
    private View vista;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvcartel;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        binding.btllamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
homeViewModel.llamar("123",v.getContext());
            }
        });

return root;

        //------------------
//        vista=inflater.inflate(R.layout.fragment_home,container,false);
//        btllamar = (Button) vista.findViewById(R.id.btllamar);
  /*
        vm.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
               binding.tvcartel.setText("");
            }
        });
*/

  //      btllamar.setOnClickListener(new View.OnClickListener() {
  //          @Override
        //public void onClick(View v) {

                //
                  //startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));

                //Intent i = (new Intent(Intent.ACTION_CALL), Uri.parse("tel:123"));
               // Intent i = (new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));
              //i.addFlags(i.FLAG_ACTIVITY_NEW_TASK);
              //  startActivity(i);




  //          }
        });
//        return vista;

        /* esto es lo que estaba hasta return root
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        TextView textView = binding.edNumero;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

*/



/*
        vista=inflater.inflate(R.layout.fragment_home, container, false);



        boton = (Button)  vista.findViewById(R.id.btLlamar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "hola", Toast.LENGTH_SHORT).show();
                //galleryViewModel.llamaraNumero(123);
            }
        });




        return vista;
*/

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}