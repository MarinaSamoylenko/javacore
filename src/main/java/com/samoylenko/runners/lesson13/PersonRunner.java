package com.samoylenko.runners.lesson13;

import com.samoylenko.app.classwork.lesson13.Person;
import com.samoylenko.app.classwork.lesson13.Student;
import com.samoylenko.app.classwork.lesson13.Teacher;

/**
 * Created by Sergioli on 4/25/17.
 */
public class PersonRunner {
    public static void main(String[] args){
        String university = "DPI";
        String name = "Marina";
        String faculty = "Philosofy";
        int age = 27;
        int experience = 4;
        int degree = 2;

        Student student = new Student(name,age,university);
        student.setUniversity("KPI");
        student.setAge(18);
        student.setDegree(4);
        student.printStudentInfo();
        Person person = new Person(name);

        Teacher teacher = new Teacher(faculty, university, age, experience, degree, name);
        teacher.setFaculty("Sociology");
        teacher.setDegree(5);
        teacher.printTeacherInfo();
        person.showDegree();

        student.showDegree();

        teacher.showDegree();





    }

}
