package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;


public class Task2x1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВедите строку 1:");
        String str1 = scanner.nextLine();
        System.out.print("ВВедите строку 2:");
        String str2 = scanner.nextLine();

        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();
        char[] fin = new char[str1.length()];

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str1arr[i] == str2arr[j]) {
                        fin[i] = str2arr[j];
                    }
                }
            }
            if (Arrays.equals(str1arr, fin)) {
                System.out.println("Строки являются перестоновкой друг друга");
            } else
                System.out.println("Строки не являются перестоновкой друг друга");
        }else
            System.out.println("Строки не являются перестановкой! ");

        scanner.close();
    }
}
