package com.samoylenko.app.classwork.lesson3;

import com.sun.tools.doclets.formats.html.PackageUseWriter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sergioli on 3/15/17.
 */
public class MathfuncTest {
    @Test //Junit framework annotation
    public void multiplyTest() {
        int a = 1;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumTest() {
        int x = 2;
        int y = 3;
        MathFunc mathsum = new MathFunc();
        int actualResult = mathsum.sum(x, y);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minusTest() {
        int q = 109;
        int e = 30;
        MathFunc difference = new MathFunc();
        int actualResult = difference.minus(q, e);
        int expectedResult = 79;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void summaTest() {
        int d = 124;
        int c = 231;
        MathFunc getSum = new MathFunc();
        int actualResult = getSum.summa(d, c);
        int expectedResult = 355;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtracionTest() {
        int s = 12389;
        int z = 5669;
        MathFunc getSubtracion = new MathFunc();
        int actualResult = getSubtracion.subtracion(s, z);
        int expectedResult = 6720;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divTest() {
        int a = 6;
        int b = 2;
        MathFunc getDiv = new MathFunc();
        int actualResult = getDiv.div(a, b);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calPlusTest() {
        int a = 81;
        int b = 11;
        MathFunc getCalPlus = new MathFunc();
        int actualResult = getCalPlus.calPlus(a, b);
        int expectedResult = 92;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minTest() {
        int y = 3122;
        int x = 22;
        MathFunc getMin = new MathFunc();
        int actualResult = getMin.min(y, x);
        int expectedResult = 3166;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divAndMinusTest() {
        int a = 48;
        int b = 1;
        int c = 6;
        int d = 9;
        MathFunc getDivAndMinus = new MathFunc();
        int actualResult = getDivAndMinus.divAndMinus(a, b, c, d);
        int expectedResult = 33;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void minAndPlusTest() {
        int a = 243;
        int b = 51;
        MathFunc getMinAndPlus = new MathFunc();
        int actualResult = getMinAndPlus.minAndPlus(a, b);
        int expectedResult = 588;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void plusTest() {
        String name = "Marina ";
        String surname = "Samoylenko";
        MathFunc sPlus = new MathFunc();
        String actualResult = sPlus.plus(name, surname);
        String expectedResult = "Marina Samoylenko";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
