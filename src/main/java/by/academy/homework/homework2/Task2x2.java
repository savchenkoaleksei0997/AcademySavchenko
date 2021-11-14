package by.academy.homework.homework2;

import java.util.Scanner;

// Задание не выполнил (

public class Task2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  количество слов : ");
        int n = scanner.nextInt();

        String[] str = new String[n];
        int[] sum = new int[n];
        char[] sim = new char[127];

        for (int i = 0; i < str.length; i++){
            char[] arrChar = str[i].toCharArray();
            for (int j = 0; j < sim.length; j++){
            }

        }

        System.out.println("Введите слово : ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(i + 1 + ".");
            str[i] = scanner.next();
        }


        System.out.println("Слово, в котором число различных символов минимально : " );

        scanner.close();
    }
}
