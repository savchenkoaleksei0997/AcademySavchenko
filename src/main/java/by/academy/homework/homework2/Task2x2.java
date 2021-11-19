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
        int result = 0;

        System.out.println("Введите слово : ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(i + 1 + ".");
            str[i] = scanner.next();
        }

        for (int i = 0; i < str.length; i++) {
            sum[i] = countUniqueChars(str[i]);
        }

        for (int i = 0; i < str.length - 1; i++) {
            if (sum[i] < sum[i + 1]) {
                result = i;
            }
        }

        System.out.println("Слово в котором число различных символов минимально : " + str[result]);

        scanner.close();
    }

    // Метод количества уникальных значений.
    public static int countUniqueChars(String s) {
        int counter = 0;
        int[] allChars = new int[2048];
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            allChars[arr[i]]++;
        }
        for (int i = 0; i < allChars.length; i++) {
            if (allChars[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}
