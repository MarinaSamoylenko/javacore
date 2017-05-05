package com.samoylenko.app.classwork.lesson14;

import com.samoylenko.app.classwork.polimorfizm.Computer;

/**
 * Created by Sergioli on 4/28/17.
 */
public class Hp extends Computer {
    @Override
    public void changeRam() {

        super.changeRam();
        System.out.print("Changing HP RAM memory");
    }

    @Override
    public void changeTOSSD() {
        super.changeTOSSD();
    }
}
