package by.academy.additionalTasks.stringsTask;

import java.util.Scanner;

public class Taks3classwork {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк : ");
        int n = scanner.nextInt();

        String[] arr = new String[n];
        int ave = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите строку : ");
            arr[i] = scanner.next();
            ave += (arr[i].length());
        }

        a = ave / n;

        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() < a)
            System.out.println(arr[i] + ", " + arr[i].length());
        }


    }
}
