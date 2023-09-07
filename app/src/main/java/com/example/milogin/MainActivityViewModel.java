package com.example.milogin;

import static androidx.core.content.PermissionChecker.checkSelfPermission;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import android.Manifest;


public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<Usuario> usu;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();

    }

    public LiveData<Usuario> getUsuarioIngresado() {
        if (usu == null) {
            usu = new MutableLiveData<>();
            ;
        }
        return usu;
    }

    public void inicializarUsuario() {
        Usuario usuarioharc = new Usuario("Pablo", "1234");
    }

    public void solicitarPermiso(){

    }
    public void validarUsuario(String n, String p) {
        if (n.length() == 0 && p.length() == 0) {
            Toast.makeText(context, "falta ingresar el usuario y/o la contraseña", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(context, MainActivitymenu.class);
            intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);

        }
    }
}