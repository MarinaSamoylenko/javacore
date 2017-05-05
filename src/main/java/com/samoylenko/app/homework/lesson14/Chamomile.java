package com.samoylenko.app.homework.lesson14;

/**
 * Created by Marina on 5/4/17.
 */
public class Chamomile extends Flowers {
    public int quantityAndCost() {
        int price = getCostOne() * getNumber();
        System.out.println(getNumber() + " Chamomile " + "and costs = " + price);
        return price;
    }
}
