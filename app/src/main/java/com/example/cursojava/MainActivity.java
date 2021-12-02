package com.example.cursojava;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView txtIdioma, txtTamanho;
    private Button btnIdioma, btnTamanho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIdioma = findViewById(R.id.txt_idioma);
        btnIdioma = findViewById(R.id.btn_idioma);


        btnTamanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });



    }



    public void clicarBotao(View View){
        Locale idioma = Locale.getDefault();
        txtIdioma.setText(idioma.getDisplayLanguage());
    }
}