package com.samoylenko.app.utils.convertors;

/**
 * Created by Sergioli on 3/15/17.
 */
public class PrimitiveConvertor {//конвертируют примитивные типы

    public char floatToChar(float floatNumber){ //пишем тип переменной, которую возвращаем
        char x = (char)floatNumber;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " + x);
        return x;//возврат значения

    }
    public void intToChar(int inti){//метод "ничего не возвращает"
        char y = (char) inti;
        System.out.println("Input int value is " + inti + ". Output char value is " + y);
    }
    public int charToInt(char charz){
        int a = (int) charz;
        System.out.println("Input float value is " + charz + ". Output char value is " + a);
    return a;
    }
}
