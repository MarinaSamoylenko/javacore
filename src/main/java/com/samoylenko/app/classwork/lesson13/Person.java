package com.samoylenko.app.classwork.lesson13;

/**
 * Created by Sergioli on 4/25/17.
 */
public class Person {
//    protected String name;
//    public String university;
//    public int age;
//public int degree;
//    public Person(String name){
//        this.name = name;
//    }
//
//    public  Person(String university, int age, String name) {
//   this(name);
//   this.age = age;
//   this.university = university;
//    }
//
//    protected  void printPersonInfo (){
//        System.out.println(name);
//    }
//    public void showDegree(){
//        System.out.println("General degree");
//    }
//}
protected String name;
    private String university;
    private int age;
    private int degree;
    public Person(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public  Person(String university, int age, String name) {
        this(name);
        this.age = age;
        this.university = university;
    }

    protected  void printPersonInfo (){
        System.out.println(name);
    }
    public void showDegree(){
        System.out.println("General degree");
    }
}
