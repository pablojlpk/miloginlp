package com.example.milogin;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class NainActivtyViewModel extends AndroidViewModel {
private Context context;
private MutableLiveData<Usuario> usu;



    public NainActivtyViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }
    public LiveData<Usuario> getUsuario(){
        if (usu == null) {
            usu = new MutableLiveData<>();;
        }
    }
    public void inicializarUsuario (){
        Usuario usuarioharc = new Usuario("Pablo","1234");
    }
    public void validarUsuaro(String n, String p){


    }
}
