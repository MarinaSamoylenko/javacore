package com.samoylenko.app.homework.lesson12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Реализовать класс WhiteCollar, который наследует Human и в конструкторе принимает значения возраста, имени и компании,
// при этом вызывая родительский конструктор для сохранения в приватные поля имени и возраста.
// Реализовать сеттер setCompany (String string), который сохраняет в поле companyName введенное значение, если оно
// состоит только из латинских символов, тире, пробела и/или запятых. В противном случае выводится сообщение
// “Company name is invalid”.
public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(int age, String name) { // Конструктор с параметрами
        super(age, name);// вызов конструктора родительского класса
    }

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        this.companyName = companyName;
    }
    public String setCompanyName(String companyName) {
        this.companyName = companyName;
        Pattern pattern = Pattern.compile("[a-zA-Z||,-]*");
        Matcher matcher = pattern.matcher(companyName);
        if (matcher.matches()) {
            System.out.println("It is company name: " + companyName);
        } else {
            System.out.println("Company name is invalid");
        }

        return companyName;
    }
}


