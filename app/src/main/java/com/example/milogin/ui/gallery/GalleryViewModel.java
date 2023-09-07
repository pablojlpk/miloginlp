package com.example.milogin.ui.gallery;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

public class GalleryViewModel extends AndroidViewModel {

    private MutableLiveData<String> mText;
private Context context;

    public GalleryViewModel(@NotNull Application application) {
        super(application);;
        mText = new MutableLiveData<>();
        //mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {

        if (mText == null) {
            mText = new MutableLiveData<>();
        }
        return mText;
    }

    public void llamaraNumero(int numerotel) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + numerotel));
        Toast.makeText(context, "llamando a "+numerotel, Toast.LENGTH_SHORT).show();
        if (intent.resolveActivity(getApplication().getPackageManager()) != null) {
            context.startActivity(intent);

        }
    }

}