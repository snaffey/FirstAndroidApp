package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView viewRes;
    EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsoma);
        viewRes = findViewById(R.id.resultView);
        Button btnSoma = findViewById(R.id.btnSomar);
        Button btnSubtrair = findViewById(R.id.btnSubtrair);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular("+");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular("-");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular("*");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular("/");
            }
        });
    }

    private void calcular(String operacao) {
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        if (TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(n1.getText().toString());
        double num2 = Double.parseDouble(n2.getText().toString());
        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                Toast.makeText(this, String.format("Soma: %.2f", resultado), Toast.LENGTH_SHORT).show();
                break;
            case "-":
                resultado = num1 - num2;
                Toast.makeText(this, String.format("Subtração: %.2f", resultado), Toast.LENGTH_SHORT).show();
                break;
            case "*":
                resultado = num1 * num2;
                Toast.makeText(this, String.format("Multiplicação: %.2f", resultado), Toast.LENGTH_SHORT).show();
                break;
            case "/":
                if (num2 == 0) {
                    Toast.makeText(this, "Não é possível dividir por zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                resultado = num1 / num2;
                Toast.makeText(this, String.format("Divisão: %.2f", resultado), Toast.LENGTH_SHORT).show();
                break;
        }

        viewRes.setText(String.valueOf(resultado));
    }
}
