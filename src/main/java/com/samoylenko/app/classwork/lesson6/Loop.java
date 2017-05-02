package com.samoylenko.app.classwork.lesson6;


public class Loop {
    int a = 35;
    int b = 10;


    public void comparasing() {

        while (a > b) {
            a = a - 1;
            System.out.println("A is " + a + "B is " + b);
            if (a <= b) {
                System.out.println("A = " + a + "B = " + b);
            }

        }
    }

}
