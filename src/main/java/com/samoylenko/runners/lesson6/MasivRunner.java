package com.samoylenko.runners.lesson6;

import com.samoylenko.app.homework.lesson6.Masiv;

/**
 * Created by Sergioli on 3/27/17.
 */
public class MasivRunner {
    public static void main(String[] args) {
        Masiv arrayA = new Masiv();
        arrayA.arrayHomeA();

        Masiv arrayB = new Masiv();
        arrayB.arrayHomeB();

        Masiv arrayC = new Masiv();
        arrayC.arrayHomeC();

        Masiv arrayE = new Masiv();
        arrayE.arrayHomeE();

        Masiv arrayG = new Masiv();
        arrayG.arrayHomeG();
Masiv gScan = new Masiv();
gScan.scan();

        Masiv arrayMy = new Masiv();
        arrayMy.chetNechet();

        Masiv arrayMinMax = new Masiv();
        arrayMinMax.arrayMinMaxD();

        Masiv multiA = new Masiv();
        multiA.muliDim();

        Masiv intaray = new Masiv();
        intaray.arToString();

        Masiv intarray = new Masiv();
        intaray.arrayDouble();
    }
}
