package com.samoylenko.app.classwork.lesson14;


public class IncapsulationCar {
    private String name = "Car"; //процесс сокрытия данных с помощью модификатора доступа privat

//возвращает значение name
    public String getName() {
        return name;
    }
//изменяет значние name
    public void setName(String name) {
        this.name = name;
    }
}
