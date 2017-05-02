package com.samoylenko.app.classwork.lesson13;

public class Teacher extends Person{
    private String faculty;
    private int experience;
    private int degree;

    public Teacher(String faculty, String university, int age, int experience, int degree, String name) {
        super (university, age, name);
        this.faculty = faculty;
        this.experience = experience;
        this.degree= degree;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getDegree() {
        return degree;
    }

    @Override
    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void printTeacherInfo() {
        System.out.println("Teacher info: name " + name +  "faculty"  + getFaculty() + "university " + getUniversity() + "age " + getAge() +
                "experience " + getExperience() + "degree " + getDegree());
    }
    public void showDegree(){
        System.out.println("Teacher degree " + getDegree());
    }
}


