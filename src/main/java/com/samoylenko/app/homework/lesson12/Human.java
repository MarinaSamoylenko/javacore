package com.samoylenko.app.homework.lesson12;
// Написать класс Human который имеет только один конструктор (конструктор должен быть с параметрами, принимающий
// на входе возраст и имя человека). Поля возраст и имя должны быть приватными, а в классе должны быть реализованы
// геттеры getName(), getAge() и сеттер setAge (int age) который проверяет что возраст человека находится в диапазоне
// 1..120 лет, и в зависимости от этого выводит сообщение “New age setted” и сохраняет значение в поле возраста,
// или выводит сообщение “Age invalid” (если возраст не входит в диапазон).

public class Human {
    private int age;
    private  String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human (int age, String name) {

        if (age <= 120) {
            System.out.println("New age setted");
        }
         else if (age >1) {
            System.out.println("New age setted");
        }
        else {
            System.out.println("Age invalid");
    }

}
}
