package com.example.banco;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void moneda(View vista){
        Intent nvclientes= new Intent(this, MonedaAc.class);
        startActivity(nvclientes);
    }
    public void medida(View vista){
        Intent nvmedida= new Intent(this, MedidaAc.class);
        startActivity(nvmedida);
    }
    public void grado(View vista){
        Intent nvgrado= new Intent(this, GradoAc.class);
        startActivity(nvgrado);
    }

}