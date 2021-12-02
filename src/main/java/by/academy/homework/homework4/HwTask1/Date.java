package by.academy.homework.homework4.HwTask1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date {
    LocalDate dateLocal;
    Day day;
    Month month;
    Year year;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Date() {
        super();
    }

    public Date(Day day) {
        super();
        this.day = day;
    }

    public Date(Day day, Month month) {
        super();
        this.day = day;
        this.month = month;
    }

    public Date(Day day, Month month, Year year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setFullData(String date) {
        dateLocal = LocalDate.parse(date, dateTimeFormatter);
        day.setDay(dateLocal.getDayOfMonth());
        month.setMonth(dateLocal.getMonthValue());
        year.setYear(dateLocal.getYear());
    }

    public void printDayOfWeek(String date) {
        dateLocal = LocalDate.parse(date, dateTimeFormatter);
        DayOfWeek day = dateLocal.getDayOfWeek();
        System.out.println("День недели : " + day);
    }

    public void CountsOfDay(String date) {
        dateLocal = LocalDate.parse(date, dateTimeFormatter);
        LocalDate now = LocalDate.now();
        long diff = ChronoUnit.DAYS.between(dateLocal, now);
        System.out.println("С даты " + date + " до " + now + " прошло " + diff + " дней.");
    }

    public static class Year {
        int year;
        LocalDate dateLocal;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        public Year() {
            super();
        }

        public Year(int year) {
            super();
            this.year = year;
        }

        public void yearLip(String date){
            dateLocal = LocalDate.parse(date, dateTimeFormatter);
            if (dateLocal.isLeapYear() == true) {
                System.out.println("Год высокосный!");
            } else {
                System.out.println("Год не высокосный!");
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public static class Month {
        int month;

        public Month() {
            super();
        }

        public Month(int month) {
            super();
            this.month = month;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }
    }

    public static class Day {
        int day;

        public Day() {
            super();
        }

        public Day(int day) {
            super();
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }
}
