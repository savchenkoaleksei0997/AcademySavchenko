package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class HWTask2x5 {
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        Random randoms = new Random();
        final int N = 1000000;
        final int M = 100000;
        for (int i = 0; i < N; i++) {
            arrayList.add(randoms.nextDouble());
            linkedList.add(randoms.nextDouble());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get((randoms.nextInt(M - 1)));
        }
        System.out.println("Затрачено времени в милисекундах: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get((randoms.nextInt(M - 1)));
        }
        System.out.println("Затрачено времени в милисекундах: " + (System.currentTimeMillis() - startTime));
    }
}
