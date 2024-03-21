package com.softulp.traductor;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.softulp.traductor.entidades.Palabra;

import java.util.ArrayList;

public class SegundaViewModel extends AndroidViewModel {
    private ArrayList<Palabra> list;
private MutableLiveData<Palabra> mutablePalabra= new MutableLiveData<>();
    public SegundaViewModel(@NonNull Application application) {
        super(application);
        listapalabra();

    }
    public void traducir(String palabra)
    {

        for(Palabra item:list){
            if (item.getEspanol().equalsIgnoreCase(palabra)) {
                mutablePalabra.setValue(item);
                return;
            }
        }
        mutablePalabra.setValue(null);
    }
    public LiveData<Palabra> getMutablePalabra(){
        return mutablePalabra;
    }
    private void listapalabra(){
        list= new ArrayList<>();
        list.add(new Palabra("Arbol", "Tree", R.drawable.arbol));
        list.add(new Palabra("Auto", "Car", R.drawable.auto));
        list.add(new Palabra("Computadora", "Computer", R.drawable.computadora));
        list.add(new Palabra("Pelota", "Ball", R.drawable.pelota));
        list.add(new Palabra("Tigre", "Tiger", R.drawable.tigre));
    }
}
