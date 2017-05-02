package com.samoylenko.app.classwork.lesson12;

public class Bicycle {
   public String color;
   public String wheelSize;
   public int speed;
   public int price;


    public Bicycle (String color){// Bicycle constructor with args

        // типизация парамеров и количство параментров у  конструкторов и методов в классе не должно совпадать!!!
        // У КОНСТРУКТОРА ИМЯ КАК НАЗВАНИЕ КЛАССА
        // конструкторы создаются, когда есть некоторые обьектв в которые нужно внсти параметры
        this.color = color;
        this.speed = 10;
         }


    public Bicycle(String colorBicycle,String wheelSizeBicycle, int speed){ // Bicycle constructor with args
        color = colorBicycle;//динамичская переменная
        wheelSize = wheelSizeBicycle;
    }
    public Bicycle(String colorBicycle,String wheelSizeBicycle, int speed, int price){ // Bicycle constructor with args
        this (colorBicycle, wheelSizeBicycle,speed);
        this.price = price;//динамичская переменная

    }
    public Bicycle (){
        color = "red";//hardcode должно быть меньше
    }



}
