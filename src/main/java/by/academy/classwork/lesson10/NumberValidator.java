package by.academy.classwork.lesson10;

import by.academy.homework.homework3.AmericanNumberValidator;
import by.academy.homework.homework3.BelarusianBumberValidator;
import by.academy.homework.homework3.EmailValidator;

import java.util.Scanner;

public class NumberValidator {
    public static void main(String[] args) {

        BelarusianBumberValidator v = new BelarusianBumberValidator();
        AmericanNumberValidator b = new AmericanNumberValidator();
        EmailValidator s = new EmailValidator();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона : ");
        String number = scanner.next();

        System.out.println(s.isValid(number));



//        if (v.isValid(number) == true) {
//            System.out.println("Вы ввели белорусский номер.");
//        } else if (b.isValid(number) == true) {
//            System.out.println("Вы ввели Американский номер");
//        } else {
//            System.out.println("Вы ввели неизвестный номер.");
//        }
    }
}
