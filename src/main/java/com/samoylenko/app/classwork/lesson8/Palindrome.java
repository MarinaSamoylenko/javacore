package com.samoylenko.app.classwork.lesson8;

/**
 * Created by Sergioli on 4/4/17.
 */
public class Palindrome {
    //Далее просто используем метод reverseString() для того, чтобы получить перевернутую строку и сравнить ее с оригинальной
    //(для проверки равенства строк используется метод equals)
    String palindrome = "moom";

    boolean isPalindrome = true;
public void pal1 () {
    for (int i=0;i<palindrome.length()/2;i++){

        isPalindrome=isPalindrome&&

                (palindrome.charAt(i)==palindrome.charAt

                        (palindrome.length()-i-1));}
    if(isPalindrome){
        System.out.println("Palindrome");  }
    else{
        System.out.println("Not palindrome");

    }
        }
}


