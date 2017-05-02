package com.samoylenko.runners.Homework;

import com.samoylenko.app.homework.lesson12.Robot;

/**
 * Created by Sergioli on 4/25/17.
 */
public class RobotRunner {
    public static void main(String[] args) {
        // Создаем объекта класса Robot
        Robot robot = new Robot();

        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Это более корректный способ менять курс.
        // Реализация внутри робота не сильно отличается, но
        // мы в любой момент сможем сделать более продвинутую версию
        // Но класс RobotManager об этом даже не узнает
        robot.setCourse(90);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();

        // Курс 45 градусов
        robot.setCourse(45);
        // Вперед на 20 метров
        robot.forward(20);
        // Напечатать координаты
        robot.printCoordinates();
    }
}
