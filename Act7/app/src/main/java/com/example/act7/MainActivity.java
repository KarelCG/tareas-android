package com.example.act7;

import android.app.DatePickerDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.*;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button fecha;
    Date fenac=new Date();
    TextView f1, f2, edad;
    int aa=0;
    int ma=0;
    int anio=0, mes=0, dia=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fecha=(Button) findViewById(R.id.button);
        f1=(TextView) findViewById(R.id.fenac);
        f2=(TextView) findViewById(R.id.feact);
        edad=(TextView) findViewById(R.id.edad);
        fecha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId()==R.id.button){
            Calendar ca = Calendar.getInstance();
            anio = ca.get(Calendar.YEAR);
            mes = ca.get(Calendar.MONTH);
            int dia = ca.get(Calendar.DAY_OF_MONTH);
            f1.setText("Fecha Actual: "+dia+"/"+(mes+1)+"/"+anio);
            DatePickerDialog recogerFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener(){
                @Override
                public void onDateSet(DatePicker view, int año, int mesi, int diaa){
                    final int mesActual = mesi + 1;
                    String diaFormateado = (diaa < 10)? "0" + String.valueOf(diaa):String.valueOf(diaa);
                    String mesFormateado = (mesActual < 10)? "0" + String.valueOf(mesActual):String.valueOf(mesActual);
                    f2.setText("Fecha nacimiento: "+diaFormateado + "/" + mesFormateado + "/" + año);
                    aa=año;
                    ma=Integer.parseInt(mesFormateado);
                    edad.setText(calcular(anio,(mes+1),aa,ma));
                }
            },anio, mes, dia);
            recogerFecha.show();
        }
    }
    public String calcular(int a, int m, int aa, int ma){
        int años=0;
        int meses=0;
        if(ma<=m){
            años=a-aa;
            meses=m-ma;
        }else{
            años=a-aa-1;
            meses=12-(ma-m);
        }
        return "Edad: "+años+" años "+meses+" meses";
    }
}