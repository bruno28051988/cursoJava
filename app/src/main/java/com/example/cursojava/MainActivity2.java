package com.example.cursojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText txtN1, txtN2, txtData;
    private Button igual, btnMais, btnMenos, calcular;
    private TextView resultado, resIdade, resSexo;
    private RadioGroup opcaoSexo;
    private RadioButton masculino, feminino;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtN1 = findViewById(R.id.txtN1);
        txtN2 = findViewById(R.id.txtN2);
        igual = findViewById(R.id.btn_soma);
        resultado = findViewById(R.id.resultado);

        btnMais = findViewById(R.id.btn_mais);
        btnMenos = findViewById(R.id.btn_menos);
        txtData = findViewById(R.id.txt_data);
        calcular = findViewById(R.id.btn_calcular);

        resIdade = findViewById(R.id.res_idade);

        opcaoSexo = findViewById(R.id.radio_sexo);
        masculino = findViewById(R.id.radio_masc);
        feminino = findViewById(R.id.radio_fem);
        resSexo = findViewById(R.id. res_sexo);
        imagem = findViewById(R.id.img);




        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.parseDouble(String.valueOf(txtN1.getText()));
                double n2 = Double.parseDouble(String.valueOf(txtN2.getText()));
                double soma = n1 + n2;
                resultado.setText(Double.toString(soma));
            }
        });

        dataBotoes();
        radioButton();

    }

    public void dataBotoes(){

        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int campodata = Integer.parseInt(String.valueOf(txtData.getText()));
                int acrescenta = campodata + 1;
                txtData.setText(Integer.toString(acrescenta));
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int campodata = Integer.parseInt(String.valueOf(txtData.getText()));
                int subtrair = campodata - 1;
                txtData.setText(Integer.toString(subtrair));
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int campodata = Integer.parseInt(String.valueOf(txtData.getText()));
                int idade = 2021 - campodata;
                resIdade.setText(Integer.toString(idade));
            }
        });
    }

    public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String sexo = "";
                if (i == R.id.radio_masc){
                    String selSexo = masculino.getText().toString();
                    sexo = selSexo;
                    imagem.setImageResource(R.drawable.man);

                }else {
                    String selSexo = feminino.getText().toString();
                    sexo = selSexo;
                    imagem.setImageResource(R.drawable.images);
                }
                resSexo.setText(sexo);
            }
        });


    }

}