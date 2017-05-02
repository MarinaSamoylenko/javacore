package com.samoylenko.runners.lesson12;

import com.samoylenko.app.classwork.lesson12.Bicycle;

/**
 * Created by Sergioli on 4/21/17.
 */
public class BicycleRunner {
    public static void main(String[] args) {
        String color = "red";
        String wheelSize = "10";
        String colorBicycle = "Black";
        String wheelSizeBicycle = "14";
        int speed = 34;
        int price = 1333;
        Bicycle bicycle = new Bicycle (color);
        Bicycle bicycle2 = new Bicycle (color, wheelSize, speed);
        Bicycle bicycle3 = new Bicycle ();
        Bicycle bicycle4 = new Bicycle(colorBicycle, wheelSizeBicycle, speed, price);
        System.out.println (bicycle.color);
        System.out.println ("Bicycle 2: " + bicycle2.color + " "+ bicycle2.wheelSize);
        System.out.println ("Bicycle 4: " + bicycle4.color + " " + bicycle4.wheelSize + " " + bicycle4.speed + " " +bicycle4.price);
    }
}
