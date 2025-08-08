package com.example.banco;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MedidaAc extends AppCompatActivity {
    Spinner opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medida);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.medida), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        opciones=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.medidas, android.R.layout.simple_spinner_item);
        opciones.setAdapter(adapter);
        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                EditText ed1=(EditText) findViewById(R.id.editTextNumber13);
                TextView t1=(TextView) findViewById(R.id.textView14);
                TextView t2=(TextView) findViewById(R.id.textView19);
                TextView t3=(TextView) findViewById(R.id.textView21);
                TextView t4=(TextView) findViewById(R.id.textView23);
                TextView t5=(TextView) findViewById(R.id.textView26);
                TextView t6=(TextView) findViewById(R.id.textView27);
                TextView t7=(TextView) findViewById(R.id.textView31);
                TextView t8=(TextView) findViewById(R.id.textView33);
                TextView t9=(TextView) findViewById(R.id.textView35);
                TextView t10=(TextView) findViewById(R.id.textView37);
                TextView t11=(TextView) findViewById(R.id.textView25);
                Double mili=0.0,centi=0.0,deci=0.0,met=0.0,in=0.0,ft=0.0,yd=0.0,mile=0.0,km=0.0;
                if(parent.getItemAtPosition(position).equals("m")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*1000;centi=valor*100;deci=valor*10;met=valor;in= valor*39.3701;
                    ft=valor*3.28;yd=valor*1.0936;mile=valor*0.000621;km=valor*0.001;
                }if(parent.getItemAtPosition(position).equals("mm")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*1;centi=valor*0.1;deci=valor*0.01;met=valor*0.001;in= valor*0.0393701;
                    ft=valor*0.00328;yd=valor*0.0010936;mile=valor*0.000000621;km=valor*0.000001;
                }if(parent.getItemAtPosition(position).equals("cm")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*10;centi=valor;deci=valor*0.1;met=valor*0.01;in= valor*0.393701;
                    ft=valor*0.0328;yd=valor*0.010936;mile=valor*0.00000621;km=valor*0.00001;
                }if(parent.getItemAtPosition(position).equals("dm")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*100;centi=valor*10;deci=valor;met=valor*0.1;in= valor*3.93701;
                    ft=valor*0.328;yd=valor*0.10936;mile=valor*0.0000621;km=valor*0.0001;
                }if(parent.getItemAtPosition(position).equals("inch")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*0.254;centi=valor*2.54;deci=valor*25.4;met=valor*0.0254;in= valor;
                    ft=valor*0.083;yd=valor*0.028;mile=valor*0.00001578;km=valor*0.0000254;
                }if(parent.getItemAtPosition(position).equals("ft")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*304.8;centi=valor*30.48;deci=valor*3.048;met=valor*0.3048;in= valor*12;
                    ft=valor;yd=valor*0.33;mile=valor*0.000189;km=valor*0.0003048;
                }if(parent.getItemAtPosition(position).equals("yd")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*914;centi=valor*91.4;deci=valor*9.14;met=valor*0.914;in= valor*36;
                    ft=valor*3;yd=valor;mile=valor*0.000568;km=valor*0.000914;
                }if(parent.getItemAtPosition(position).equals("mile")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*1009340;centi=valor*100934;deci=valor*10093.4;met=valor*1009.34;in= valor*63360;
                    ft=valor*5280;yd=valor*1760;mile=valor;km=valor*1.6093;
                }if(parent.getItemAtPosition(position).equals("km")){
                    Double valor=Double.parseDouble(ed1.getText().toString());
                    mili=valor*1000000;centi=valor*100000;deci=valor*10000;met=valor*1000;in= valor*39370.1;
                    ft=valor*3280.84;yd=valor*1093.6;mile=valor*0.621;km=valor;
                }


                t1.setText(mili+"");
                t2.setText(centi+"");
                t3.setText(deci+"");
                t4.setText(met+"");
                t5.setText(in+"");
                t7.setText(ft+"");
                t9.setText(yd+"");
                t10.setText(mile+"");
                t11.setText(km+"");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
    public void retornar(View vista){
        Toast.makeText(this,"RETORNAR",Toast.LENGTH_SHORT).show();
        finish();
    }
}
