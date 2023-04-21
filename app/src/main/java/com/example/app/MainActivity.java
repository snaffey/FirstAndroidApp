package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.widget.EditText;

import android.widget.Button;

import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView viewRes;
    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsoma);
        viewRes = (TextView) findViewById(R.id.resultView);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        Button btnSoma = (Button) findViewById(R.id.btnSomar);
        Button btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        Button btnDividir = (Button) findViewById(R.id.btnDividir);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());
                    double soma = num1 + num2;
                    viewRes.setText(String.valueOf(soma));
                    Toast.makeText(MainActivity.this, "Soma: " + soma, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());
                    double subtracao = num1 - num2;
                    viewRes.setText(String.valueOf(subtracao));
                    Toast.makeText(MainActivity.this, "Subtração: " + subtracao, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());
                    double multiplicacao = num1 * num2;
                    viewRes.setText(String.valueOf(multiplicacao));
                    Toast.makeText(MainActivity.this, "Multiplicação: " + multiplicacao, Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().isEmpty() || n2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    double num1 = Double.parseDouble(n1.getText().toString());
                    double num2 = Double.parseDouble(n2.getText().toString());
                    if (num2 == 0) {
                        Toast.makeText(MainActivity.this, "Não é possível dividir por zero", Toast.LENGTH_SHORT).show();
                    } else {
                        double divisao = num1 / num2;
                        viewRes.setText(String.valueOf(divisao));
                        Toast.makeText(MainActivity.this, "Divisão: " + divisao, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

