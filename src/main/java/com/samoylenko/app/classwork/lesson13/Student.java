package com.samoylenko.app.classwork.lesson13;


public class Student extends Person {

    public Student(String name, int age, String university) {
        super(university, age, name); // call parent (super) class constructor
    }

    public final void printStudentInfo() {
        System.out.println("Student's info: name " + getName() + "university " + getUniversity()+ "age " + getAge());
    }
    public void showDegree(){
        System.out.println("Student degree "+ getDegree());
    }
}
