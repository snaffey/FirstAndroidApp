package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextView viewRes;
    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsoma);
        int a;
        viewRes = (TextView) findViewById(R.id.viewRes);
        n1 = (EditText) findViewById(R.id.n1);
        n2 = (EditText) findViewById(R.id.n2);
        Button btnSoma = (Button) findViewById(R.id.btnSomar);
        // setText() -> alterar via java o conteudo da view
        viewRes.setText("Alterado via java");
    }
    public void alterarTxt(){
        viewRes.setText("Alterado via java");
    }
}