package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.calculadora.R.id.btn_borrar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //solucion
    private TextView solucion;
    //numeros
    private Button num_cero;
    private Button num_uno;
    private Button num_dos;
    private Button num_tres;
    private Button num_cuatro;
    private Button num_cinco;
    private Button num_seis;
    private Button num_siete;
    private Button num_ocho;
    private Button num_nueve;
    //operaciones
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;
    private Button btn_igual;
    private Button btn_borrar;
    //variables para guardar lo que ingrsa el usuario
    private  String numero ="";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //solucion (la puede encontrar.en la vista.solucion
        //numeros
        solucion =  findViewById(R.id.solucion);
        num_cero =   findViewById(R.id.num_cero);
        num_uno  =   findViewById(R.id.num_uno);
        num_dos  =   findViewById(R.id.num_dos);
        num_tres =   findViewById(R.id.num_tres);
        num_cuatro =   findViewById(R.id.num_cuatro);
        num_cinco =   findViewById(R.id.num_cinco);
        num_seis =   findViewById(R.id.num_seis);
        num_siete =   findViewById(R.id.num_siete);
        num_ocho =   findViewById(R.id.num_ocho);
        num_nueve =   findViewById(R.id.num_nueve);

        //operaciones
        btn_multiplicacion = findViewById(R.id.btn_multiplicar);
        btn_division = findViewById(R.id.btn_division);
        btn_resta = findViewById(R.id.btn_resta);
        btn_borrar = findViewById(R.id.btn_borrar);

        //this es el contexto (segun contexto)
        num_cero.setOnClickListener(this);
        num_uno.setOnClickListener(this);
        num_dos.setOnClickListener(this);
        num_tres.setOnClickListener(this);
        num_cuatro.setOnClickListener(this);
        num_cinco.setOnClickListener(this);
        num_seis.setOnClickListener(this);
        num_siete.setOnClickListener(this);
        num_ocho.setOnClickListener(this);
        num_nueve.setOnClickListener(this);

        //lo mismo pero con los botones de operaciones
        btn_resta.setOnClickListener(this);
        btn_division.setOnClickListener(this);
        btn_multiplicacion.setOnClickListener(this);
        btn_borrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //cuando en la vista/view(v) vaya por el(get) id0
        switch (v.getId()){
            //NUMEROS PARA AGREGAR
            case R.id.num_cero:
                numero = numero + "0";
                solucion.setText(numero);
                break;

            case R.id.num_uno:
                numero = numero + "1";
                solucion.setText(numero);
                break;

            case R.id.num_dos:
                numero = numero + "";
                solucion.setText(numero);
                break;

            case R.id.num_tres:
                numero = numero + "3";
                solucion.setText(numero);
                break;

            case R.id.num_cuatro:
                numero = numero + "4";
                solucion.setText(numero);
                break;

            case R.id.num_cinco:
                numero = numero + "5";
                solucion.setText(numero);
                break;

            case R.id.num_seis:
                numero = numero + "6";
                solucion.setText(numero);
                break;

            case R.id.num_siete:
                numero = numero + "7";
                solucion.setText(numero);
                break;

            case R.id.num_ocho:
                numero = numero + "8";
                solucion.setText(numero);
                break;

            case R.id.num_nueve:
                numero = numero + "9";
                solucion.setText(numero);
                break;

                //OPERACIONES PARA AGREGAR
            case R.id.btn_resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;


            case R.id.btn_resultado:
                num2 = Integer.parseInt(numero);


                switch (symbol){
                    case "+":
                        solucion.setText("solucion: " + (num1 + num2));
                        break;
                    case "-":
                        solucion.setText("solucion: " + (num1 - num2));
                        break;
                    case "/":
                        solucion.setText("solucion: " + (num1 / num2));
                        break;
                    case "X":
                        solucion.setText("solucion: " + (num1 * num2));
                        break;
                }


                num1 = 0;
                num2 = 0;
                numero = "";

                break;

            case R.id.btn_borrar:
                symbol = "";
                num1 = 0;
                num2 = 0;
                numero = "";
                solucion.setText("0");
                break;






        }
    }
}
