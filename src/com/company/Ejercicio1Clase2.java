package com.company;

public class Ejercicio1Clase2 {

    public static void main(String[] args) {
        CuentaCorriente cuentaNueva = new CuentaCorriente(30, 3);
        CuentaCorriente otra = new CuentaCorriente(cuentaNueva);
        cuentaNueva.transferir(10, otra);
        System.out.printf("saldo otra: " + otra.getSaldo());

        System.out.println(otra);
    }
}
