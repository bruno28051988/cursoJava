package com.example.cursojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText numerador, denominador;
    private Button dividir;
    private TextView resDivisao, resResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        numerador = findViewById(R.id.txt_numerador);
        denominador = findViewById(R.id.txt_denominador);
        dividir = findViewById(R.id.btn_dividir);
        resDivisao = findViewById(R.id.res_divisao);
        resResto = findViewById(R.id.res_resto_divisao);

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resutado();
            }
        });
    }

    private void resutado() {

        double campoNumerado = Double.parseDouble(String.valueOf(numerador.getText()));
        double campoDenomidador = Double.parseDouble(String.valueOf(denominador.getText()));
        double resultadoDivisao = campoNumerado / campoDenomidador;
        double resultadoResto = campoNumerado % campoDenomidador;
        resDivisao.setText(Double.toString(resultadoDivisao));
        resResto.setText(Double.toString(resultadoResto));
    }
}