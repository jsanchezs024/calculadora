package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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
    private Button btn_clear;

    private  string number ="";
    public double num1 = 0;
    private doubble num2 = 0;
    protected String symbol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //solucion (la puede encontrar.en la vista.solucion
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

        btn_multiplicacion = findViewById(R.id.btn_multiplicar);
        btn_division = findViewById(R.id.btn_division);
        btn_resta = findViewById(R.id.num_resta);
        btn_borrar = findViewById(R.id.btn_borrar);




        key_padSum = findViewById(R.id.sum);
        key_padSubstract = findViewById(R.id.division);

        //listener for button

        keyPad5.setOnClickListener(this);
        keyPad2.setOnClickListener(this);


        keyPadSum.setOnClickListener(this);
        keyPadSubstract.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                number = number + "0";
                solucion.setText(number);
                break;

            case R.id.num_uno:
                number = number + "1";
                solucion.setText(number);
                break;

            case R.id.num_dos:
                number = number + "";
                solucion.setText(number);
                break;

            case R.id.num_tres:
                number = number + "3";
                solucion.setText(number);
                break;

            case R.id.num_cuatro:
                number = number + "4";
                solucion.setText(number);
                break;

            case R.id.num_cinco:
                number = number + "5";
                solucion.setText(number);
                break;

            case R.id.num_seis:
                number = number + "6";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "7";
                solucion.setText(number);
                break;

            case R.id.num_siete:
                number = number + "8";
                solucion.setText(number);
                break;

            case R.id.num_nueve:
                number = number + "9";
                solucion.setText(number);
                break;

            case R.id.sum:
                symbol = "+";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.substract:
                symbol = "-";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.division:
                symbol = "/";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.multiply:
                symbol = "X";
                num1 = Integer.parseInt(number);
                number = "";
                break;

            case R.id.equal:
                num2 = Integer.parseInt(number);

                switch (symbol){
                    case "+":
                        solucion.setText( (num1 + num2));
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
                number = "";

                break;

            case R.id.CE:
                symbol = "";
                num1 = 0;
                num2 = 0;
                number = "";
                solucion.setText("");
                break;


        }
    }
}
