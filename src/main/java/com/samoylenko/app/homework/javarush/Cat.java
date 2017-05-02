package com.samoylenko.app.homework.javarush;

/**
 * Created by Sergioli on 3/19/17.
 */
public class Cat {
    int age;
    String name;
    Person person;//обьявление сложного объкта с другого класса
    Toy toy;
    CatEat catEat;
    Telephone telephone;
    Plate plate = new Plate(); //обьявление сложного обьекта и автоматическое его создание
}
