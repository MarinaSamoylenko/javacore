package com.samoylenko.runners.lesson4;


import com.samoylenko.app.classwork.lesson4.Car;

/**
 * Created by Sergioli on 3/17/17.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.name = "h300";
        Car toyota = new Car();
        toyota.name = "corrola";
        System.out.println(lexus.name + " " + Car.wheelCounter);
        System.out.println(toyota.name + " " + Car.wheelCounter);

        Car.wheelCounter = 5;
        System.out.println(Car.wheelCounter);
        System.out.println(Car.PI);

        Car.detal();
        Car sprinter = new Car();
        sprinter.model = "30190EK";
        System.out.println (sprinter.model + " number " + Car.rul);
        Car bluber = new Car ();
        bluber.model = "nissan";
        Car.rul = 324;
        System.out.println (bluber.model + " marka " + Car.rul);
        System.out.println(Car.HELLO);

System.out.println("Window is " + Car.WINDOW);

    }
}
