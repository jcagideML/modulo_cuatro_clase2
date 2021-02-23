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

       try{
           String s = dia + "/"+ mes+ "/"+anio;

           Date date = formateador.parse(s);
           System.out.println(date);
           return true;
       }catch (Exception e) {
           return false;
       }
    }

    // Suma un día a la fecha actual
    public void addOneDay(){
        Calendar gc = new GregorianCalendar(this.anio, this.mes, this.dia);

        gc.add(Calendar.DAY_OF_MONTH, 1);
        setDia(gc.get(Calendar.DAY_OF_MONTH));
        setMes(gc.get(Calendar.MONTH));
        setAnio(gc.get(Calendar.YEAR));
    }

    @Override
    public String toString(){
        return getDia() + "/"+ getMes() +"/" + getAnio();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
