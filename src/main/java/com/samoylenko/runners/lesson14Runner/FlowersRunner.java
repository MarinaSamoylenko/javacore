package com.samoylenko.runners.lesson14Runner;

import com.samoylenko.app.homework.lesson14.*;

/**
 * Created by Marina on 5/4/17.
 */
public class FlowersRunner {
    public static void main(String[] args) {
int totalCost = 0;

        Flowers rosesFlower = new Roses();
        rosesFlower.setCostOne(40);
        rosesFlower.setNumber(11);
        Flowers tulipsFlower = new Tulips();
        tulipsFlower.setCostOne(28);
        tulipsFlower.setNumber(11);
        Flowers carnationsFlower = new Carnations();
        carnationsFlower.setNumber(5);
        carnationsFlower.setCostOne(13);
        Flowers chamomileFlower = new Chamomile();
        chamomileFlower.setCostOne(11);
        chamomileFlower.setNumber(3);
    Flowers [] flowers = new Flowers[4];
    flowers [0] = rosesFlower;
    flowers [1] = tulipsFlower;
    flowers [2] = carnationsFlower;
    flowers [3] = chamomileFlower;
       totalCost= changePriceForFlowersForArray(flowers);

//        totalCost += changePriceForFlowers(rosesFlower);
//        totalCost += changePriceForFlowers(tulipsFlower);
//        totalCost += changePriceForFlowers(carnationsFlower);
//        totalCost += changePriceForFlowers(chamomileFlower);
        System.out.println("Total price for bouquet is: " + totalCost);
    }



    public static int changePriceForFlowersForArray (Flowers [] flowers) {
       int priceTot = 0;

        for (Flowers flower : flowers) {
             priceTot+=flower.quantityAndCost();
        }
        return priceTot;
    }

    }

