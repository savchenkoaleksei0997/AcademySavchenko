package by.academy.classwork.lesson10;

public class ArrayFindUniqueDemo {
    public static void main(String... args){
        int[] array = {1,7,9,8,8,7,1};

        int result = 0;
        for (int i = 0; i < array.length; i++){
            result ^= array[i];
        }

        System.out.println(result);
    }
}
