package by.academy.classwork.task;

import java.util.Scanner;

public class Task3classwork {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *=  i ;
            System.out.println(result);

        }
        scanner.close();
    }
}
