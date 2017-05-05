package com.samoylenko.app.classwork.lesson14;

import com.samoylenko.app.classwork.polimorfizm.Computer;

public class IVM extends Computer {
    public void changeRAM (){
        System.out.print("Changing IVM RAM memory");
    }

    @Override
    public void changeTOSSD() {
        super.changeTOSSD();
    }
}
