package by.academy.additionalTasks.cicles;

import java.util.Scanner;

public class Task2classwork {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = 1;

        for (int i = 0; i <= number; i++){
            result += i;
            System.out.println(result);

        }
        scanner.close();
    }
}
