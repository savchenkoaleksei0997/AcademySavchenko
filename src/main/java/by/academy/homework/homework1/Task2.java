package by.academy.homework.homework1;


import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String variable;

        System.out.println("Старт программы.");
        System.out.print("Введите тип переменной:");
        variable = scanner.nextLine();

        switch (variable) {

            case "int":
                System.out.print("Введите данные типа int : ");
                if (scanner.hasNextInt()) {
                    int numberInt = scanner.nextInt();
                    int resultInt = numberInt % 2;
                    System.out.println(resultInt);
                } else
                    System.out.println("Вы ввели  данные не типа int, перезапустите программу!");
                break;

            case "double":
                System.out.print("Введите данные типа double : ");
                if (scanner.hasNextDouble()) {
                    double numberDouble = scanner.nextDouble();
                    double resultDoble = numberDouble * 0.7;
                    System.out.println(resultDoble);
                } else
                    System.out.println("Вы ввели  данные не типа double, перезапустите программу!");
                break;

            case "float":
                System.out.print("Введите данные типа float : ");
                if (scanner.hasNextFloat()) {
                    float numberFloat = scanner.nextFloat();
                    float resultFloat = numberFloat * 2;
                    System.out.println(resultFloat);
                } else
                    System.out.println("Вы ввели  данные не типа float, перезапустите программу!");
                break;

            case "char":
                System.out.print("Введите данные типа char : ");
                int variableChar;
                variableChar = System.in.read();
                System.out.println(variableChar);
                break;

            case "String":
                System.out.print("Введите данные типа String : ");
                String str = scanner.nextLine();
                System.out.println("Hello " + str);
                break;

            default:
                System.out.println("Unsupported type.");

        }
        scanner.close();
    }
}

