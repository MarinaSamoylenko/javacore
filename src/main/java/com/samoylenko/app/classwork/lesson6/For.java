package com.samoylenko.app.classwork.lesson6;

/**
 * Created by Sergioli on 3/24/17.
 */
public class For {
    public void prining() {
        String s = "i=";
        for (int i = 1; i < 10; i++) {
            System.out.println(s + i);

        }
    }

    public void even() {
String a = "Even number is ";
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(a + i);
            }
        }
    }

    public void numb() {
        String b = "Number is ";
        for (int i = 3; i <= 34; i++) {
            if (i % 2 == 0) {
                System.out.println(b + i);
            }
        }

    }
}
