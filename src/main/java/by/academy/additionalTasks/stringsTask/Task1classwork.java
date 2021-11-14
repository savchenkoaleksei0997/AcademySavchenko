package by.academy.additionalTasks.stringsTask;

import java.util.Scanner;

public class Task1classwork {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк : ");
        int n = scanner.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++){
//            System.out.print("Введите строку : ");
            arr[i] = scanner.next();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " " + arr[i].length());
        }

    }
}
