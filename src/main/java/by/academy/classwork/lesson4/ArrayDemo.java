package by.academy.classwork.lesson4;

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(10);
        }
        System.out.println("Initial array:" );
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            arr[i] += 10;
        }
        System.out.println("new arr:");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
