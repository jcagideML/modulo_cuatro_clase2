package com.company;

public class Fraccion {
    private int dividendo;
    private int divisor;

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo(){
        return this.dividendo;
    }

    public int getDivisor(){
        return this.divisor;
    }
    public Fraccion(int dividendo,int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public static Fraccion Suma(Fraccion f1, Fraccion f2){
        int nuevoDivisor = f1.getDivisor()*f2.getDivisor(); //Se podría sacr MCD para hacerlo mas elegante
        return new Fraccion(f1.getDividendo()*nuevoDivisor + f2.getDividendo()*nuevoDivisor,nuevoDivisor);
    }

    public static Fraccion Suma(Fraccion f1, int entero){
        return new Fraccion(f1.getDividendo() + entero*f1.getDivisor(),f1.getDivisor());

    }

    public Fraccion Suma(Fraccion fra){
        int nuevoDivisor = this.getDivisor()*fra.getDivisor(); //Se podría sacr MCD para hacerlo mas elegante
        this.setDividendo(this.getDividendo() + fra.getDividendo()*nuevoDivisor);
        this.setDivisor(nuevoDivisor);
        return this;

    }
    public Fraccion Suma(int entero){
        this.setDividendo(this.getDividendo()+entero*this.getDivisor());
        return this;

    }

    public static Fraccion Resta(Fraccion f1, Fraccion f2){
        int nuevoDivisor = f1.getDivisor()*f2.getDivisor(); //Se podría sacr MCD para hacerlo mas elegante
        return new Fraccion(f1.getDividendo()*nuevoDivisor - f2.getDividendo()*nuevoDivisor,nuevoDivisor);

    }

    public static Fraccion Resta(Fraccion f1, int entero){
        return new Fraccion(f1.getDividendo() - entero*f1.getDivisor(),f1.getDivisor());

    }

    public Fraccion Resta(Fraccion fra){
        int nuevoDivisor = this.getDivisor() * fra.getDivisor(); //Se podría sacr MCD para hacerlo mas elegante
        this.setDividendo(this.getDividendo() * nuevoDivisor - fra.getDividendo() * nuevoDivisor);
        this.setDivisor(nuevoDivisor);
        return this;

    }

    public static Fraccion Multiplicar(Fraccion f1, Fraccion f2){
        return new Fraccion(f1.getDividendo()*f2.getDividendo(),f1.getDivisor()*f2.getDivisor());
    }

    public static Fraccion Multiplicar(Fraccion f1, int entero){
        return new Fraccion(f1.getDividendo()*entero,f1.getDivisor());
    }
    public Fraccion Multiplicar(Fraccion fra){
        this.setDividendo(this.getDividendo() * fra.getDividendo());
        this.setDivisor(this.getDivisor() * fra.getDivisor());
        return this;
    }

    public Fraccion Multiplicar(int entero){
        this.setDividendo(this.getDividendo()*entero);
        return this;
    }

    public static Fraccion Dividir(Fraccion f1, Fraccion f2){
        return new Fraccion(f1.getDividendo()*f2.getDivisor(),f1.getDivisor()*f2.getDividendo());

    }
    public static Fraccion Dividir(Fraccion f1, int entero){
        return new Fraccion(f1.getDividendo(),f1.getDivisor()*entero);
    }

    public Fraccion Dividir(Fraccion fra){
        this.setDividendo(this.getDividendo()*fra.getDivisor());
        this.setDivisor(this.getDivisor() * fra.getDividendo());
        return this;
    }

    public Fraccion Dividir(int entero){
        this.setDivisor(this.getDivisor() * entero);
        return this;
    }
}
