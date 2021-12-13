package by.academy.homework.homework5;

import java.time.LocalTime;
import java.util.Random;

public class Demo {

    public static void main(String[] args){
        Random randoms = new Random();

        LocalTime a = LocalTime.now();
        System.out.println(a);
        for (int i = 0; i < 10; i++){
            System.out.println(randoms.nextInt(100000));
        }

        LocalTime b = LocalTime.now();
        System.out.println(b);


    }
}
