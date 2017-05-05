package com.samoylenko.app.homework.lesson14;

/**
 * Created by Marina on 5/4/17.
 */
public class Roses extends Flowers {


        public int quantityAndCost () {
                int price = getCostOne() * getNumber();
                System.out.println(getNumber() + " Roses " + "and costs = " + price);
                return price;
        }
    }

