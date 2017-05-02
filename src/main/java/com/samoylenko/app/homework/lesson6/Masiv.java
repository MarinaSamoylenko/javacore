package com.samoylenko.app.homework.lesson6;

import java.util.Scanner;
import java.util.Arrays;
import java.io.Console;

public class Masiv {
    public void arrayHomeA() {
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int x = 0; x < 10; x++) {
            System.out.print(a[x] + " ");//вывод в строку

        }
        System.out.println();
        for (int x = 0; x < 10; x++) {
            System.out.println(a[x]);//Вывод в столбик
        }
    }

    public void arrayHomeB() {//Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,а затем этот же массив выведите на экран в другую строку,
        // но в обратном порядке (99 97 95 93 … 7 5 3 1).
        int a = 0;//В переменной а будет храниться значение размера массива, которое мы получим с помощью простого цикла
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }
        //Создаем массив, и используя цикл, заполним его ячейки. Сразу выведем на экран значения элементов массива в строку
        int[] mas = new int[a];
        for (
                int i = 1, counter = 0;
                i <= 99; i++)

        {
            if (i % 2 != 0) {
                mas[counter] = i;
                System.out.print(mas[counter] + " ");
                counter++;
            }
        }
        System.out.println(" ");//Выводим на экран каждый элемент массива на отдельной строке в обратном порядке
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }

    public void arrayHomeC() //Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
    // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке
    {
        int[] c = {2, 3, 6, 1, 5, 2, 3, 0, 6, 5, 8, 7, 1, 3, 6};
        c[0] = 2;
        c[1] = 3;
        c[2] = 6;
        c[3] = 1;
        c[4] = 5;
        c[5] = 2;
        c[6] = 3;
        c[7] = 0;
        c[8] = 6;
        c[9] = 5;
        c[10] = 8;
        c[11] = 7;
        c[12] = 1;
        c[13] = 3;
        c[14] = 6;
        for (int arrayPosition : c) {
            System.out.print(arrayPosition + " ");
        }
        System.out.println();

        int counter = 0;
        System.out.print("Четные элементы массива myList: "); // Вывод четных элементов массива на экран.
        for (int i = 0; i < c.length; i++) {
            if (c[i] % 2 == 0) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public void arrayHomeE()//Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
    {
        int[][] c = {{10, 40, 55, 23, 49}, {27, 77, 64, 4, 97}, {53, 65, 32, 52, 22}, {11, 32, 45, 86, 72}, {52, 65, 96, 77, 78}, {43, 24, 77, 55, 11}, {66, 44, 66, 87, 45}, {11, 37, 46, 55, 86}};
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                System.out.print(c[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public void arrayHomeG() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = in.nextInt();
        System.out.println("Enter number: ");
        int input1 = in.nextInt();
        System.out.println("Enter number: ");
        int input2 = in.nextInt();
        Console console = System.console();
        if (console == null) {
            System.out.print("Your sum is:" + input + input1 + input2);
        }
    }

    public void scan() {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }

    public void chetNechet() {
        double[] myList = {2, 2.7, 3, 12, 23.8};// Массива myArray из 5 элементов типа double.
        System.out.print("Четные элементы массива myList: "); // Вывод четных элементов массива на экран.
        for (int i = 0; i < myList.length; i++)

        {
            if (myList[i] % 2 == 0) {
                System.out.print(myList[i] + ", ");
            }
        }
        System.out.print("Нечетные элементы массива myList: ");// Вывод нечетных элементов массива на экран.
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 != 0) {
                System.out.println(myList[i] + ", ");
            }
        }

    }

    // Создайте массив из 15 случайных целых чисел из отрезка [0;999]. Выведите массив на экран. Выведите минимальное и
    // максимальное значение элементов массива
    public void arrayMinMaxD() {
        int[] d = {453, 555, 1, 33, 998, 4, 333, 245, 234, 666, 435, 123, 432, 54, 6, 81};
        int max = d[0];// Переменной max задаем значение нулевого элемента.

        // Перебираем все элементы массива.
        for (int i = 1; i < d.length; i++) {
            // Сравниваем значение переменной max со значениями элемента массива.
            // Если значение элемента массива больше значения переменной max,
            // то новое значение переменной max будет равно значению этого элемента.
            if (d[i] > max) {
                max = d[i];
            }
        }
        System.out.println("Максимальное значение в массиве myArray: " + max);  // Выводим на экран наибольший элемент массива myArray.
        // Переменной min задаем значение нулевого элемента.
        int min = d[0];


        for (int i = 1; i < d.length; i++) // Перебираем все элементы массива.
        // Сравниваем значение переменной min со значениями элемента массива.
        // Если значение элемента массива меньше значения переменной min,
        // то новое значение переменной min будет равно значению этого элемента.
        {
            if (d[i] < min) {
                min = d[i];
            }
        }
        // Выводим на экран наименьший элемент массива myArray.
        System.out.println("Минимальное значение в массиве myArray: " + min);
    }

    public void muliDim() //
    {
        int[] intArray = {66, 1, 432};

        for (int i = 0; i < intArray.length; i++) {

            System.out.println(intArray[i]);

        }
    }

    public void arToString() {
        int[] intArray = {1, 2, 3};

        System.out.println(Arrays.toString(intArray));//в квадратных скобках

    }

    public void arrayDouble() {
        int[][] intArray = new int[5][7];


        for (int j = 0; j < intArray.length; j++) {

            for (int k = 0; k < intArray[j].length; k++) {

                intArray[j][k] = j * k;
                System.out.print(intArray[j][k] + " ");
            }
            System.out.println();
        }
    }
}