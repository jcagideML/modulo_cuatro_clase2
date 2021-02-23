package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    int dia;
    int mes;
    int anio;

    public Fecha(){
        GregorianCalendar gCal = new GregorianCalendar();
        this.dia = gCal.get(Calendar.DAY_OF_MONTH);
        this.mes = gCal.get(Calendar.MONTH) + 1;
        this.anio = gCal.get(Calendar.YEAR);
    }

    public Fecha(int dia, int mes, int anio){
        boolean correct = validarDatos(dia,mes,anio);
        if(correct){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }
    }

    public boolean validarDatos(int dia, int mes, int anio){

        if(anio<1){
            return false;
        }
        if(mes >12 || mes <1){
            return false;
        }

        GregorianCalendar gCal = new GregorianCalendar(anio,mes,1);
        int maxDia = gCal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if(dia < 1 || dia > maxDia){
            return false;
        }

        
        return true;

    }

    @Override
    public String toString(){
        return dia + "/"+ mes +"/" + anio;
    }
}
