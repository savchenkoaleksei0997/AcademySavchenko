package by.academy.homework.homework5;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HWTask1x5 {

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(1);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(3);
        number.add(2);
        number.add(3);
        number.add(4);

        System.out.println(number);

        System.out.println(removeDuplicates(number));



    }
}
