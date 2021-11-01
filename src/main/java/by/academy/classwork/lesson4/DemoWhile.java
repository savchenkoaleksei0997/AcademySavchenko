package by.academy.classwork.lesson4;

import java.util.Scanner;

public class DemoWhile {
    public static void main (String[] args){

        int a = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            if ( a > 0){
                System.out.println("Число равно:" + a);
            }
            System.out.print("Введите число:");
            a += scanner.nextInt();
        } while ( a < 500);

    }
}
