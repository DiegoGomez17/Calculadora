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

    public void calcular(View v) {

        String textonumero1 = String.valueOf(edt_numero_uno.getText());
        String textonumero2 = String.valueOf(edt_numero_dos.getText());
        //-------------------------------------------------------------
        double numero1 = Double.valueOf(textonumero1);
        double numero2 = Double.valueOf(textonumero2);
        //-------------------------------------------------------------
        double resultado = 0.0;
        switch (v.getId())
        {
            case R.id.bt_sumar: resultado = numero1 + numero2;
                               break;
            case R.id.bt_restar: resultado = numero1 - numero2;
                                break;
            case R.id.bt_multiplicar: resultado = numero1 * numero2;
                                break;
            case R.id.bt_dividir:
                if (numero2!= 0)
                {
                    resultado = numero1 / numero2;
                }
                else {
                    edt_numero_dos.setError("no puedes poner cero");
                }
                  break;
            case R.id.bt_resto:
                if (numero2!= 0)
                {
                    resultado = numero1 % numero2;
                }
                else {
                    edt_numero_dos.setError("no puedes poner cero");
                }
                break;
            default:
                break;
        }
        //-------------------------------------------------------------
        double resultadoRedondeado = Math.round(resultado *100.0)/100.0;
        //-------------------------------------------------------------
        txt_resultado.setText(String.valueOf(resultadoRedondeado));
    }
}

