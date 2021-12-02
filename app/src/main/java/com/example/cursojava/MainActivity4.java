package com.example.cursojava;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    private Button mais, menos, calcular;
    private EditText numero;
    private TextView resto, cubo, raizQuadrada, raizCubica, absoluto;
    private LinearLayout restoMain4, cuboMain4, raizQuadradaMain4, raizCubicaMain4, absolutoMain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        mais = findViewById(R.id.btnMais);
        menos = findViewById(R.id.btnMenos);
        calcular = findViewById(R.id.btnCancular);
        numero = findViewById(R.id.editNumero);
        resto = findViewById(R.id.edit_restoMain4);
        cubo = findViewById(R.id.edit_cuboMain4);
        raizQuadrada = findViewById(R.id.edit_raizMain4);
        raizCubica = findViewById(R.id.edit_raizCubicaMain4);
        absoluto = findViewById(R.id.edit_absolutoMain4);

        restoMain4 = findViewById(R.id.restoMain4);
        cuboMain4 = findViewById(R.id.cuboMain4);
        raizQuadradaMain4 = findViewById(R.id.raizQuadradaMain4);
        raizCubicaMain4 = findViewById(R.id.raizCubicaMain4);
        absolutoMain4 = findViewById(R.id.absolutoMain4);

        botoes();

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar();
            }
        });
    }

    public void mostrar(){
        int res = Integer.parseInt(String.valueOf(numero.getText()));

        int resto1 = res % 2;
        resto.setText(Integer.toString(resto1));
        restoMain4.setVisibility(View.VISIBLE);

        double cubo1 = (double) Math.pow(res, 3);
        cubo.setText(Double.toString(cubo1));
        cuboMain4.setVisibility(View.VISIBLE);

        double raizQuadrada1 = (double) Math.sqrt(res);
        raizQuadrada.setText(Double.toString(raizQuadrada1));
        raizQuadradaMain4.setVisibility(View.VISIBLE);

        double raizCubica1 = Math.cbrt(res);
        raizCubica.setText(Double.toString(raizCubica1));
        raizCubicaMain4.setVisibility(View.VISIBLE);

        int absoluto1 = (int) Math.abs(res);
        absoluto.setText(Integer.toString(absoluto1));
        absolutoMain4.setVisibility(View.VISIBLE);


    }

    public void botoes(){

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(String.valueOf(numero.getText()));
                int acresc = res + 1;
                numero.setText(Integer.toString(acresc));
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(String.valueOf(numero.getText()));
                int sub = res - 1;
                numero.setText(Integer.toString(sub));
            }
        });
    }
}