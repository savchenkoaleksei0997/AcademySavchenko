package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int age;
        double sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст покупателя:");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            if (age > 0) {
                System.out.println("Введите сумму покупки:");
                if (scanner.hasNextInt()) {
                    sum = scanner.nextInt();
                    if (sum > 0) {
                        System.out.println(" Сумма покупки:" + sum + " руб.");
                        if (sum < 100) {
                            sum *= (1 - 0.05);
                            System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                        } else if (sum >= 100 && sum < 200) {
                            sum *= (1 - 0.07);
                            System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                        } else if (sum >= 200 && sum < 300) {
                            if (age > 18) {
                                sum *= (1 - (0.12 + 0.04));
                                System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                            } else {
                                sum *= (1 - (0.12 - 0.03));
                                System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                            }
                        } else if (sum >= 300 && sum < 400) {
                            sum *= (1 - 0.15);
                            System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                        } else if (sum >= 400) {
                            sum *= (1 - 0.20);
                            System.out.println(" Сумма покупки со скидкой:" + sum + " руб.");
                        }
                    } else {
                        System.out.println("Вы ввели некоректные данные, перезапустите программу!");
                    }
                } else {
                    System.out.println("Вы ввели некоректные данные, перезапустите программу!");
                }
            } else {
                System.out.println("Вы ввели некоректные данные, перезапустите программу!");
            }
        } else {
            System.out.println("Вы ввели некоректные данные, перезапустите программу!");
        }
        scanner.close();
    }
}
