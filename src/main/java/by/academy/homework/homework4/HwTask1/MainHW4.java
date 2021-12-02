package by.academy.homework.homework4.HwTask1;

import java.util.Scanner;

public class MainHW4 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату : ");
        String dateText = scanner.next();

        Date.Day day = new Date.Day();
        Date.Month month = new Date.Month();
        Date.Year year = new Date.Year();

        Date date = new Date(day, month, year);
        date.printDayOfWeek(dateText);
        date.setFullData(dateText);
        date.CountsOfDay(dateText);
        date.year.yearLip(dateText);

    }
}
