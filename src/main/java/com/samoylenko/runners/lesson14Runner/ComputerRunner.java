package com.samoylenko.runners.lesson14Runner;


import com.samoylenko.app.classwork.polimorfizm.Computer;
import com.samoylenko.app.classwork.lesson14.*;

public class ComputerRunner {
    public static void main(String[] args) {
//        IBM ibm = new IBM();
//        ibm.changeOnlyForIBM();
        Computer ibmComputer = new IVM();
        Computer hpComputer = new Hp();
        Computer acerComputer = new ACER();
        Computer mac = new MAC();
        Computer samsung = new Samsung();
        Computer packardbell = new PackardBell();
//        changesForComputers(ibmComputer);
//        changesForComputers(hpComputer);
//        changesForComputers(acerComputer);
//        changesForComputers(mac);
        Computer [] computers = new Computer [4];
        computers[0] = ibmComputer;
        computers[1] = hpComputer;
        computers[2] = acerComputer;
        computers[3] = mac;
        changesForComputersArray(computers);
//      Computer [] comp = new Computer[2];
//       comp [0] = samsung;
//       comp [1] = packardbell;
//        changesForComputersArray (comp);
    }
    public static void changesForComputersArray(
            Computer[] computers){
        for(Computer computer: computers) {
            changesForComputers(computer);
        }
    }
    public static void changesForComputers(Computer computer){
        computer.changeRam();
        computer.changeTOSSD();
        computer.changeCPU();
    }
}
