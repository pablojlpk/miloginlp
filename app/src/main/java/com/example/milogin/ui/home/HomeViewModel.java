package com.example.milogin.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class HomeViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;
//    private Context context;


    public HomeViewModel(@NonNull Application application) {
        super(application);

        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }

    public void llamaraNumero(int numerotel, Context context) {
        Toast.makeText(context, "llamando a " + numerotel, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + numerotel));
        if (intent.resolveActivity(getApplication().getPackageManager()) != null) {
            context.startActivity(intent);
        }


    }
}

