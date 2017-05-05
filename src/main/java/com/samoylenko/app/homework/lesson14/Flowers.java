package com.samoylenko.app.homework.lesson14;

//Необходимо реализовать иерархию цветов (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
// Создать несколько объектов-цветов. Собрать букет с определением его стоимости. В букет может входить несколько цветов одного типа.
public class Flowers {
private int number, costOne, totalCost;

    public int getTotalCost() {
        return totalCost;
    }

    public int getCostOne() {
        return costOne;
    }

    public int getNumber() {
        return number;
    }

    public void setCostOne(int costOne) {
        this.costOne = costOne;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int quantityAndCost (){
        int price = number * costOne;
                System.out.println( number + " flowers " + "and its cost = " + price);
        return price;
    }

    }
