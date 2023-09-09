package com.example.milogin.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

public class HomeViewModel extends AndroidViewModel {
    private MutableLiveData<String> mText;
//private Context context;
    public HomeViewModel(@NonNull Application application) {
        super(application);
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void llamar(String nrotel, Context context) {

//        context.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));

        Intent i = (new Intent(Intent.ACTION_CALL));
        i.addFlags(i.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:123")));
        Toast.makeText(context, "dsdsd", Toast.LENGTH_SHORT).show();

        // i.setData(Uri.parse("tel:"+ nrotel));
       // i.addFlags(i.FLAG_ACTIVITY_NEW_TASK);
       // context.startActivity(i);
    }

    /*
    Intent intent = new Intent(context, ResultadoActivity.class);
            intent.putExtra("texto",texto);
            intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
     */



        /*
        mText.setValue("");
        if (nrotel.length() > 0) {
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + nrotel));
            context.startActivity(intent);
        } else {
            mText.setValue("DEBE INGRESAR UN NUMERO");
        }
        */

        //Toast.makeText(activity, "dfadfsdfsdf", Toast.LENGTH_SHORT).show();
        //Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + nrotel));
       // context.startActivity(intent);


}

