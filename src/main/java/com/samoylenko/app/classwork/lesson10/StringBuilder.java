package com.samoylenko.app.classwork.lesson10;


class StringBuilder1 {
    public void charAt(int index) {
        StringBuilder sb1 = new StringBuilder();
        String s = "Я буду хорошим программистом!";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);
    }
}