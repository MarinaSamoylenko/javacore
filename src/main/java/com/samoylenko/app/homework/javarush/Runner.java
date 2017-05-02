package com.samoylenko.app.homework.javarush;

/**
 * Created by Sergioli on 3/19/17.
 */
public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 10;
        cat.name = "Mars";
        cat.person = new Person();//зависимость одного класса от другого
        cat.person.name = "Vasya";//присваивание name к person;
        cat.toy = new Toy();
        cat.toy.name = "Mouse";
        cat.catEat = new CatEat();
        cat.catEat.price = 3455;
        cat.plate.name ="Luminarc"; //вызов автоматичски созданного объекта с класса Cat

        Cat marsel = new Cat();//новый котб новый хозяинб игрушкаб корм
        marsel.person = new Person();
        marsel.person.name = "Sergey";
        marsel.toy = new Toy();
        marsel.toy.name = "rule";
        marsel.catEat = new CatEat();
        marsel.catEat.name = "Wiskas";
        marsel.plate.name = "Starbucks";

        Cat baks = new Cat();
        baks.person = new Person();
        baks.person.name = "Alina";
        baks.toy = new Toy();
        baks.toy.name = "ball";
        baks.catEat = new CatEat();
        baks.catEat.name = "RoyalCanin";
        baks.telephone = new Telephone();
        baks.telephone.name = "Iphone";
        baks.plate.name = "Myplate";
    }
}
