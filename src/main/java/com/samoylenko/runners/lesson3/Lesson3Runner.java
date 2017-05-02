package com.samoylenko.runners.lesson3;

import com.samoylenko.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Sergioli on 3/15/17.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convector = new PrimitiveConvertor();
        float number = 23.22f;
        char resulat = convector.floatToChar(number);
        convector.charToInt('c');
        convector.intToChar(456);
        System.out.println(resulat);
    }
}
