package com.softulp.traductor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.softulp.traductor.databinding.ActivityMainBinding;
import com.softulp.traductor.entidades.Palabra;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
private MainViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        inicializarVista();


    }
private void inicializarVista(){
binding.btnTraducir.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {


        String editIngresar= binding.editIngresar.getText().toString();
        mv.capturarPalabra(editIngresar);



    }
});

}
}