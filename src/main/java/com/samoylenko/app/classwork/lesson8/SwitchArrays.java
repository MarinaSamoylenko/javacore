package com.samoylenko.app.classwork.lesson8;



/**
 * Created by Sergioli on 3/31/17.
 */
public class SwitchArrays {
    public void switchCase() {

        int a = 10;
        switch (a)

        {
            case 0: //значение int
            case 10:
                System.out.println("a=10");
                break;
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            default:
                System.out.println("Другое значение");
                break;
        }
    }

    public void month() {
        String b = "March";
        switch (b) {
            case "April":
                System.out.println("March is 04 month");
                break;
            case "March":
                System.out.println("March is \t 03 month");//
                break;
            case "May":
                System.out.println("March is 05 month");
                break;
        }
    }

    public void arraySort() {
        int[] array =  {16,15,8,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(array);
    }
    //public void StringToChar (){
 //int counter = 10;
  //  String counter1 = String.valueOf(counter);
     //   Integer counter = Integer.valueOf(counter1);
}
