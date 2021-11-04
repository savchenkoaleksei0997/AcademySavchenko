package by.academy.additionalTasks.cicles;

import java.util.Scanner;

public class Task7classwork {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            if (number1 > number2){
                System.out.println(number1);
            }else {
                System.out.println(number2);
            }
        }
        scanner.close();
    }
}
