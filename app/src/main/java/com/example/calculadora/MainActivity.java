package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edt_numero_uno = null;
    private EditText edt_numero_dos = null;
    TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero_uno = (EditText)findViewById(R.id.edt_numero_uno);
        edt_numero_dos = (EditText) findViewById(R.id.edt_numero_dos);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado);
    }

    public void resto(View view) {
        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //-------------------------------------------------------------
        double resultado = 0.0;
        if(numero2 != 0){
            resultado = numero1 % numero2;
        }
        else {
            edt_numero_dos.setError("no puedes poner cero");
        }
        //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void dividir(View view) {
        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //-------------------------------------------------------------
        double resultado = 0.0;
        if(numero2 != 0){
            resultado = numero1 / numero2;
        }
        else {
            edt_numero_dos.setError("no puedes poner cero");
        }
        //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void multiplicar(View view) {
        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //-------------------------------------------------------------
        double resultado = numero1 * numero2;
        //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void restar(View view) {
        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //-------------------------------------------------------------
        double resultado = numero1 - numero2;
        //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }

    public void sumar(View view) {
        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
       //-------------------------------------------------------------
        double resultado = numero1 + numero2;
       //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
}