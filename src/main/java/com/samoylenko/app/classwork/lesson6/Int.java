package com.samoylenko.app.classwork.lesson6;

/**
 * Created by Sergioli on 3/24/17.
 */
public class Int {
    public void array() {
        int[] a = {1, 2, 3};
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.println("A is" + a);
    }

    public void arrayi() {
        int[] arrayInt = new int[2];//длинну массива можно узнать - имя массива length (в системаутпринтлайн)
        arrayInt[0] = 1;//можно  указывать, если не знаем значения, указать позже
        arrayInt[1] = 2;
        System.out.println(arrayInt);//
        for (int arrayPosition : arrayInt) {
            //указываем тип массива, название переменной для каждой ячйки из массива: , название массива
            System.out.println(arrayPosition);
        }
    }

    public void getarray() {
        int[] a = {3, 4, 6};//когда знаем значния
        a[0] = 3;
        a[1] = 4;
        a[2] = 6;
        System.out.println("A is" + a);
    }

    public void unArray() {
        int[] arrayInt = new int[10];//кол-во возможных значений
        arrayInt[0] = 1;
        arrayInt[1] = 3;
        for (int arrayPosition : arrayInt) {
            System.out.println(arrayInt[1]);
        }
    }
}