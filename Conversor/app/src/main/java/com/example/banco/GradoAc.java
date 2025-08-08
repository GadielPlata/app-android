package com.example.banco;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GradoAc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.grado), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void convertir(View vista){
        EditText pbs = (EditText) findViewById(R.id.editTextNumber11);
        Double vbs = Double.parseDouble(pbs.getText().toString());
        Double far=(vbs*1.8)+32;
        TextView t1 =(TextView) findViewById(R.id.textView16);
        t1.setText(String.format("%.2f",vbs)+" oC= "+String.format("%.2f",far)+" oF");
        TextView t2 =(TextView) findViewById(R.id.textView17);
        t2.setText(String.format(String.format("%.2f",far)+" = "+String.format("%.2f",vbs)+"*1.8 + 32"));
    }
    public void retornar(View vista){
        Toast.makeText(this,"RETORNAR",Toast.LENGTH_SHORT).show();
        finish();
    }
}
