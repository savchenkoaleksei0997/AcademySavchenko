package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class HWTask4x5 {

    public static int numberMax(Collection<Integer> collection){
        int maxNumber = 0;
        for (int number : collection){
            if (maxNumber < number){
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args){

        Random randoms = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();

        for (int i = 0; i < 25; i++){
            number.add(randoms.nextInt(10));
        }


        for (int number1 : number){
            System.out.println(number1);
        }

        System.out.println("Самая высокая оценка: " + numberMax(number));

    }
}
