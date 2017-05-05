package com.samoylenko.runners.lesson14Runner;

import com.samoylenko.app.classwork.lesson14.IncapsulationCar;

public class IncapsulationCarRunner {
    public static void main(String[] args) {
        IncapsulationCar car = new IncapsulationCar();
       // car.name = "BMW"; //изменяем или задаем значение
        //System.out.print(car.name);

        System.out.println (car.getName ());
    }

}
