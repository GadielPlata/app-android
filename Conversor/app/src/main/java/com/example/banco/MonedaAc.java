package com.example.banco;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MonedaAc extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_moneda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.clientes), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void retornar(View vista){
        Toast.makeText(this,"RETORNAR",Toast.LENGTH_SHORT).show();
        finish();
    }
    public void conver (View vista) {
        //Creando el puntero al editext1 bs
        EditText pbs = (EditText) findViewById(R.id.editTextNumber);
        Double vbs = Double.parseDouble(pbs.getText().toString()); //creando variable

        Double vsus = vbs / 11.25;
        EditText psus = (EditText) findViewById(R.id.editTextNumber2); //Creando el puntero al editext2 sus
        psus.setText(vsus + "");  //+"" sirve para que reconozca como texto

        Double veu = vbs / 7.23;
        EditText peu = (EditText) findViewById(R.id.editTextNumber3);
        peu.setText(veu +"");

        Double vye = vbs / 0.046;
        EditText pye = (EditText) findViewById(R.id.editTextNumber4);
        pye.setText(vye + "");

        Double vli = vbs / 8.74;
        EditText pli = (EditText) findViewById(R.id.editTextNumber5);
        pli.setText(vli + "");

        Double vau = vbs / 4.39;
        EditText pau = (EditText) findViewById(R.id.editTextNumber6);
        pau.setText(vau + "");

        Double vca = vbs / 4.86;
        EditText pca = (EditText) findViewById(R.id.editTextNumber7);
        pca.setText(vca + "");

        Double vfr = vbs / 7.69;
        EditText pfr = (EditText) findViewById(R.id.editTextNumber8);
        pfr.setText(vfr + "");

        Double vsol = vbs / 1.87;
        EditText psol = (EditText) findViewById(R.id.editTextNumber9);
        psol.setText(vsol + "");

        Double vpc = vbs / 0.0073;
        EditText ppc = (EditText) findViewById(R.id.editTextNumber10);
        ppc.setText(vpc + "");
    }
    public void limpiar(View vista) {
        //Creando el puntero
        EditText pbs = (EditText) findViewById(R.id.editTextNumber);
        pbs.setText("");
        EditText psus = (EditText) findViewById(R.id.editTextNumber2);
        psus.setText("");
        EditText peu = (EditText) findViewById(R.id.editTextNumber3);
        peu.setText("");
        EditText pye = (EditText) findViewById(R.id.editTextNumber4);
        pye.setText("");
        EditText pli = (EditText) findViewById(R.id.editTextNumber5);
        pli.setText("");
        EditText pau = (EditText) findViewById(R.id.editTextNumber6);
        pau.setText("");
        EditText pca = (EditText) findViewById(R.id.editTextNumber7);
        pca.setText("");
        EditText pfr = (EditText) findViewById(R.id.editTextNumber8);
        pfr.setText("");
        EditText psol = (EditText) findViewById(R.id.editTextNumber9);
        psol.setText("");
        EditText ppc = (EditText) findViewById(R.id.editTextNumber10);
        ppc.setText("");
    }
}
