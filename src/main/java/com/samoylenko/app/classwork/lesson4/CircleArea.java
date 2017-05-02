package com.samoylenko.app.classwork.lesson4;

/**
 * Created by Sergioli on 3/17/17.
 */
public class CircleArea {
    public static void calculateBigger() {
        int area1 = 222;
        int area2 = 3;
        String ar1 = "Area1 is bigger";
        String ar2 = "Area2 is bigger";
        if (area1 > area2) {
            System.out.println(ar1);
        } else {
            System.out.println(ar2);
        }
    }

    public static void calc() {
        double digits1 = 4.3d;
        double digits2 = 3.5d;
        String dig1 = "lnDigits1 is bigger";
        String dig2 = "lnDigits2 is bigger";
        if (digits1 > digits2) {
            System.out.print(dig1);
        } else {
            System.out.println(dig2);
        }
    }

}
