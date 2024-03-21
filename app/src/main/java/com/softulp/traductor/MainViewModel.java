package com.softulp.traductor;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Application;
import android.content.Intent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.softulp.traductor.entidades.Palabra;

public class MainViewModel extends AndroidViewModel{

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void capturarPalabra(String palabra){

    Intent intent = new Intent(getApplication().getApplicationContext(), SegundaActivity.class);
    intent.putExtra("PalabraIngresada", palabra);
intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    getApplication().startActivity(intent);
}
}
