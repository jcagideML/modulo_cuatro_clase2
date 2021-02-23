package com.company;

public class Contador {

    private int value;

    public Contador(){
        this.setValue(0);
    }

    public Contador(int n){
        this.setValue(n);
    }

    public Contador(Contador c){
        this.setValue(c.getValue());
    }

    public void increase(){
        this.value ++;
    }

    public void decrease(){
        this.value--;
    }

    private void setValue(int n){
        this.value = n;
    }

    public int getValue(){
        return this.value;
    }
}
