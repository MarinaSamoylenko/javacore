package com.samoylenko.app.homework.lesson14;

/**
 * Created by Marina on 5/4/17.
 */
public class Carnations extends Flowers {
    public int quantityAndCost () {
        int price = getCostOne() * getNumber();
        System.out.println(getNumber() + " Carnations " + "and costs = " + price);
        return price;
    }
}
