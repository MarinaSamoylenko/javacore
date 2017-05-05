package com.samoylenko.app.classwork.lesson3.lesson5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.runners.MethodSorters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Sergioli on 3/23/17.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//тестируем два метода сортировки, которые сортируют массив integerов в алфавитном порядке, и проверяют значения с expectedresult
public class BasicTest {

// Предположим, что мы тестируем методы сортировки

// Предположим, что при одинаковых входных данных каждый метод должен иметь некоторые конкретные результаты

// На практике разница между методами сортировки - время,Но мы будем использовать более earthier solution

    private static final String INPUT_DATA = "src/test/resourcers/input.txt";

    private static final String EXPECTED_RESULTS = "src/test/resourcers/expected.txt";

    private static int[] inputData = null;//[] - означают массив данных типа int

    private static int[] expectedResults = null;

    @BeforeClass //Входные данные одинаковы для всех тестов
    //считывает перед запуском в классе expected result
    public static void preConditionsForClass() throws IOException {

        expectedResults = readTheFile(EXPECTED_RESULTS);
    }

    @Before //запускается кажый раз перед тестом!!! заново перечитыват input data

    public void preConditionsForTest() throws IOException {

        inputData = readTheFile(INPUT_DATA);
    }


    @Test //проверяет что массив отсортирован Arrays.sort, массивы берутся с помощью методов из файов  input.txt , export.txt

    public void aFirstTest() {

// тесты в алфавитном порядке мы используем 'a', 'b' для заказа тестов

        System.out.println("Simple sorting test");

        Arrays.sort(inputData);//сортирует массив input data и туда же его и сохранят

        Assert.assertArrayEquals(expectedResults, inputData);//сравниват два массива по элементу, значение должно быть одинаковым
    }

    @Test //сортирует с помощью paralelSort и проверяет что получаются т же результаты что и в первом тесте,
    // так как берем сразу 2 набора данных

    public void bSecondTest() {
        String a = "Parallel sorting test";

        System.out.println(a);

        Arrays.parallelSort(inputData);

        Assert.assertArrayEquals(expectedResults, inputData);
    }

    @Test(timeout = 1000)//будет выполнятся бесконечно

    public void infinityTest() {

        while (true);
    }

    @Ignore("Not ready yet")//не будет запускаться, 1-е по анотации, 2-е нет кода

    @Test(timeout = 1000)

    public void thisTestNotready() {
    }

    @After
//обнуляет expecedResult
    public void postConditionsForTest() {

//Конечно, у java есть сборщик мусора, и этот метод теперь бесполезен

// Но представьте, если в качестве результатов нашего теста у нас есть некоторые данные в базе данных

// Поэтому после шагов, используемых для очистки вещей, это не будет автоматически очищаться

        inputData = null;
    }

    @AfterClass//обнуляет inputData

    public static void postConditionsForClass() {


        expectedResults = null;}

    public static int[] readTheFile(String path) throws IOException {

        int[] result = null;

        BufferedReader reader = new BufferedReader(new FileReader(path));//cчитывает файл

        String line;

        if ((line = reader.readLine()) != null) {

            String[] array = new String[line.split(",").length];

            array = line.split(","); //метод split разбивает строку по запятым на массив строк int

            result = fromStringArray(array);

        }

        reader.close();

        return result;
    }
    //массив символов в виде строки, который передаем и на выходе получаем массив данных в формате
    //int, который понадобиться для сортировки
    public static int[] fromStringArray(String[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            result[i] = Integer.valueOf(array[i]);

        }

        return result;
    }
}

