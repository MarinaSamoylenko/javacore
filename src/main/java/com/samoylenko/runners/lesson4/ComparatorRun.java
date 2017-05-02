package com.samoylenko.runners.lesson4;

import com.samoylenko.app.homework.Comparators;

/**
 * Created by Sergioli on 3/19/17.
 */
public class ComparatorRun {
    public static void main(String[] args) {
        Comparators comp = new Comparators();
        System.out.println("a == b = " + (comp.a == comp.b));
        System.out.println("a != b = " + (comp.a != comp.b));
        System.out.println("a > b = " + (comp.a > comp.b));
        System.out.println("a < b = " + (comp.a < comp.b));
        System.out.println("b >= a = " + (comp.b >= comp.a));
        System.out.println("b <= a = " + (comp.b <= comp.a));
    }
}
