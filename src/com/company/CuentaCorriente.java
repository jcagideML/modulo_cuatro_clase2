package com.company;

public class CuentaCorriente {
    double saldo;
    int IDusuario;

    public CuentaCorriente() {};

    public CuentaCorriente(double saldoInicial, int IDusuarioASetear) {
        saldo = saldoInicial;
        IDusuario = IDusuarioASetear;
    }
    public CuentaCorriente(CuentaCorriente cuentaACopiar) {
        saldo = cuentaACopiar.getSaldo();
        IDusuario = cuentaACopiar.getIDusuario();
    }

    public double getSaldo() {
        return saldo;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public void ingresar(double montoAIngresar) {
        saldo += montoAIngresar;
        System.out.println("Monto ingresado: " + montoAIngresar + "\nSaldo actual: " + saldo + "\n");

    }
    public void egresar(double montoAEgresar) {
        saldo -= montoAEgresar;
        System.out.println("Monto egresado: " + montoAEgresar + "\nSaldo actual: " + saldo + "\n");
    }
    public void transferir(double montoATransferir, CuentaCorriente cuentaDondeTransferir) {
        saldo -= montoATransferir;
        cuentaDondeTransferir.ingresar(montoATransferir);
        System.out.println("Monto transferido: " + montoATransferir + "\nSaldo actual: " + saldo + "\n");
    }

    public void reintegro(double montoAReintegrar) {
        saldo += montoAReintegrar;
        System.out.println("Monto reintegrado: " + montoAReintegrar + "\nSaldo actual: " + saldo + "\n");

    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "Saldo=" + saldo +
                ", ID de cliente=" + IDusuario +
                '}';
    }


}
