package com.softulp.traductor;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.softulp.traductor.databinding.ActivityMainBinding;
import androidx.activity.EdgeToEdge;



import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.softulp.traductor.databinding.ActivityMainBinding;
import com.softulp.traductor.databinding.ActivitySegundaBinding;
import com.softulp.traductor.entidades.Palabra;

import java.util.ArrayList;


public class SegundaActivity extends AppCompatActivity {
    private ArrayList<Palabra> list;
    private SegundaViewModel smv;
    private ActivitySegundaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= ActivitySegundaBinding.inflate(getLayoutInflater());
//binding= DataBindingUtil.setContentView(this,R.layout.activity_segunda);
        setContentView(binding.getRoot());

        //smv= new ViewModelProvider(this).get(SegundaViewModel.class);
        smv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaViewModel.class);


smv.getMutablePalabra().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {

               // binding.resultado.setText(palabra.getIngles());

                    binding.imageView.setImageResource(palabra.getImagen());
                    binding.resultado.setText(palabra.getIngles());

            }
        });
        smv.getMutableTvError().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.tvError.setText(s);
            }
        });

smv.traducir(getIntent().getStringExtra("PalabraIngresada"));

    }


}