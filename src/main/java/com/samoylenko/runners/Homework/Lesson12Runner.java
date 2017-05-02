package com.samoylenko.runners.Homework;

import com.samoylenko.app.homework.lesson12.Human;
import com.samoylenko.app.homework.lesson12.WhiteCollar;

/**
 * Created by Sergioli on 4/24/17.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        String name = "Masha";
        int age = 6;
        String companyName = "Agent007";
        Human human = new Human(age, name);
        WhiteCollar whiteCollar = new WhiteCollar(age, name, companyName);
    }
}
