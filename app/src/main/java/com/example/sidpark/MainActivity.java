package com.example.sidpark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sidpark.controller.RegistrarEntrada;

public class MainActivity extends AppCompatActivity {

    RegistrarEntrada registrarntrada;

    EditText marca;
    EditText modelo;
    EditText cor;
    EditText placa;
    EditText entrada;

    Button salvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFindViews();
    }

    void createFindViews() {
        marca = findViewById(R.id.marca);
        modelo = findViewById(R.id.modelo);
        cor = findViewById(R.id.cor);
        placa = findViewById(R.id.placa);
        entrada = findViewById(R.id.entrada);
        salvar = findViewById(R.id.salvar);

        createSetOnClick();
    }

    void createSetOnClick() {
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strMarca = marca.getText().toString();
                String strModelo = modelo.getText().toString();
                String strCor = cor.getText().toString();
                String strPlaca = placa.getText().toString();
                String strEntrada = entrada.getText().toString();

                createEntrada(strMarca, strModelo, strCor, strPlaca, strEntrada);
            }
        });
    }

    void createEntrada(String marca, String modelo, String cor, String placa, String entrada) {
        registrarntrada = new RegistrarEntrada();
        registrarntrada.createCarro(marca, modelo, cor, placa, entrada);
    }
}