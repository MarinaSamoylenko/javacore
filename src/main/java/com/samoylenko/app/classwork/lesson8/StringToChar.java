package com.samoylenko.app.classwork.lesson8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sergioli on 3/31/17.
 */
public class StringToChar {
    public void strToChar() {
        String stringToDisplay = "New";
        char charArrayToString[] = {'a', 'b', 'd', 'c'};

        for (int i = 0; i < charArrayToString.length; i++) {
            stringToDisplay = Arrays.toString(charArrayToString); //превращает массив char в строку
        }
        System.out.println(stringToDisplay);
    }

    // public static String valueOf (int i) {
    //   return valueOf(i);      класс
    public void valueToString() {
        int i = 10;
        String myInt = String.valueOf(i);//i конвртируем
        System.out.println(myInt);
        Integer myInteg = Integer.valueOf(i);
        System.out.println(myInteg);

        double a = 12.09d;
        String myDouble = String.valueOf(a);
        long b = 92233720368l;
        String myLonge = String.valueOf(b);
        System.out.println(myLonge);
        boolean c = true;
        String myBool = String.valueOf(c);
        System.out.println(myBool);
    }

    public void stringToValue() {
        String i = "Integer";
        Integer myString = Integer.valueOf(i);
        System.out.println(myString);
        String a = "Double";
        Double myString1 = Double.valueOf(a);
        System.out.println(myString1);
        String c = "Longe";
        Long myString2 = Long.valueOf(c);
        System.out.println(myString2);
        String d = "Boolean";
        Boolean mySring3 = Boolean.valueOf(d);
        System.out.println(mySring3);

    }

    public void splitName() {
        System.out.println("Введите ФИО");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitStringArray = inputString.split(" ");//метод который разбиват строку на массив
            System.out.println(Arrays.toString(splitStringArray)
                    .replace(",", " "));

    }

}
