package by.academy.additionalTasks.cicles;

import java.util.Scanner;

public class Task6classwork {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double percent = 0.03;
        int money = 5;
        double sum = 0;
        double result = 0;


        for (int i = 0; i < n; i++){
            sum += money * percent;
            result = sum + money;
        }
        System.out.println(result);
        scanner.close();
    }
}
