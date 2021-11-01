package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0, j = 1; i < 10 && j <= 11 && number > 0 && number <= 10; i++, j++) {
            int sum;
            sum = number * j;
            System.out.println(sum);
        }
        scanner.close();
    }
}
