package com.samoylenko.app.classwork.lesson3.lesson5;

import com.samoylenko.app.classwork.lesson3.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by Sergioli on 3/23/17.
 */
@RunWith(JUnitParamsRunner.class)
public class ParametrizedTest {
    public MathFunc mathFunc;

    @Before
    public void setUp(){
        mathFunc  = new MathFunc();

    }
@Test
@FileParameters(value = "src/test/resourcers/multiplyData.txt", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest (int a, int b, int expected){

    Assert.assertEquals(expected, mathFunc.multiply(a, b));

    }
}
