package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2x3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;

        StringBuilder sb = new StringBuilder();

        System.out.print("Введите первое слово из четного числа букв : ");
        str1 = scanner.nextLine();
        if (str1.length() % 2 == 0){
            System.out.print("Введите второе слово из четного числа букв : ");
            str2 = scanner.nextLine();
            if (str2.length() % 2 == 0){
                sb.append(str1, 0, (str1.length() / 2));
                sb.append(str2.substring(str2.length() / 2));
                System.out.println(sb);
            }else{
                System.out.println("Вы ввели слово с нечетным количеством букв, перезапустите программу.");
            }
        }else {
            System.out.println("Вы ввели слово с нечетным количеством букв, перезапустите программу.");
        }
        scanner.close();
    }
}
