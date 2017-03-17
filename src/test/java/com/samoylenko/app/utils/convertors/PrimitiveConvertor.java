package com.samoylenko.app.utils.convertors;

/**
 * Created by Sergioli on 3/15/17.
 */
public class PrimitiveConvertor {

    public void floatToChar(float floatNumber){
        char x = (char)floatNumber;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " + x);

    }
    public void intToChar(int inti){
        char y = (char) inti;
        System.out.println("Input int value is " + inti + ". Output char value is " + y);
    }
    public void charToInt(char charz){
        int a = (int) charz;
        System.out.println("Input float value is " + charz + ". Output char value is " + a);
    }
}
