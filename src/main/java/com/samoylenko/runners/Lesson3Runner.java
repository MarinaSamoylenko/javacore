package com.samoylenko.runners;

import com.samoylenko.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Sergioli on 3/15/17.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convector = new PrimitiveConvertor();
        convector.floatToChar(23.22f);
        convector.charToInt('c');
        convector.intToChar(456);
    }
}
