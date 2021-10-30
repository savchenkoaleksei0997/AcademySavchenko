package by.academy.classwork.lesson1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Product prod1 = new Product();
        prod1.setEbible("dfas");
        prod1.productEbible();
        System.out.println();


        Cat cat1 = new Cat();
        System.out.println("Введите имя:");
        cat1.setNickName(scanner.nextLine());
        System.out.println("Введите вес: ");
        cat1.setWeight(scanner.nextDouble());
        System.out.println("Введите возраст: ");
        cat1.setAge(scanner.nextInt());



        System.out.println();
        System.out.println(cat1);
        System.out.println(prod1);



    }
}
