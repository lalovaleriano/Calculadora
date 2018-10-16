package com.example.eduardo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etnum1,etnum2;
    private RadioButton rb1,rb2,rb3,rb4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnum1 = (EditText)findViewById(R.id.et1);
        etnum2 = (EditText) findViewById(R.id.et2);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton)findViewById(R.id.rb3);
        rb4 = (RadioButton)findViewById(R.id.rb4);
        tv1 = (TextView)findViewById(R.id.tv1);
    }

    public void calcular(View view){

        String  valor1_String = etnum1.getText().toString();
        String valor2_String = etnum2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_String);
        int valor2_int = Integer.parseInt(valor2_String);

        if(rb1.isChecked()){
            int suma = valor1_int+valor2_int;
            String resutado = String.valueOf(suma);
            tv1.setText(resutado);

        }else if(rb2.isChecked()){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);

        }else if(rb3.isChecked()){
            int mul = valor1_int*valor2_int;
            String resultado = String.valueOf(mul);
            tv1.setText(resultado);

        }else if(rb4.isChecked()){
            if(valor2_int==0 ){
                Toast.makeText(this, "el valor es tiene que ser diferente de cero", Toast.LENGTH_SHORT).show();

            }else{
                int div = valor1_int/valor2_int;
                String resultado = String.valueOf(div);

                tv1.setText(resultado);
            }

        }



    }



}
