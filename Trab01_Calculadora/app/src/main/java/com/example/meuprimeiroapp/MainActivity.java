package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos
    EditText edtValor1, edtValor2;
    TextView txtResultado;
    Button btSomar, btSubtrair, btMultiplicar, btDividir;

    double valor1, valor2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vínculos
        this.edtValor1 = findViewById(R.id.edtValor1);
        this.edtValor2 = findViewById(R.id.edtValor2);
        this.txtResultado = findViewById(R.id.txtResultado);
        this.btSomar = findViewById(R.id.btSomar);
        this.btSubtrair =  findViewById(R.id.btSubtrair);
        this.btMultiplicar =  findViewById(R.id.btMultiplicar);
        this.btDividir =  findViewById(R.id.btDividir);

        // Ação do botão Somar
        this.btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());

                resultado = valor1 + valor2;

                txtResultado.setText(Double.toString(resultado));
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());

                resultado = valor1 - valor2;

                txtResultado.setText(Double.toString(resultado));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());

                resultado = valor1 * valor2;

                txtResultado.setText(Double.toString(resultado));
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());

                resultado = valor1 / valor2;

                txtResultado.setText(Double.toString(resultado));
            }
        });
    }
}