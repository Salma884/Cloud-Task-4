package org.example;

public class Calculator {
    private final int n1;
    private final int n2;

    public Calculator(int a, int b){
        this.n1 = a;
        this.n2 = b;
    }
    public int add(){
        return n1+n2;
    }
    public int sub(){
        return n1-n2;
    }
    public int mul(){
        return n1*n2;
    }
    public int div(){
        return n1/n2;
    }
}
