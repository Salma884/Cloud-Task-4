package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Calculator c = new Calculator(1,2);
        System.out.println(c.mul());
        System.out.println(c.div());
    }
}
