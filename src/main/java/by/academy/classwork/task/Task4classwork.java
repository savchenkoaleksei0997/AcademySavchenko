package by.academy.classwork.task;

import java.util.Scanner;

public class Task4classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int negative = 0;
        int positive = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }

        System.out.println("Вы ввели отрицательных чисел: " + negative);
        System.out.println("Вы ввели положительных чисел:" + positive);
        System.out.println("Вы ввели нулей:" + zero);

        scanner.close();
    }
}
