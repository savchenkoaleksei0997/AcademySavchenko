package by.academy.classwork.lesson5;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args){
        String str1 = "str";
        String str2 = "stri";
        String str3 = "stra";
        String str4 = "Str";
        String str5 = "str ";
        String str6 = "str n";
        String str7 = " str";
        String str8 = "str5";

        String[] array = {str1, str2, str3, str4, str5, str6, str7, str8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        int index = -1;
//        int[] arr = new int[10];
//        int counter = 0;
//
//        do {
//            index = s.indexOF("S", index == -1 ? 0 : index++ );
//            if (index != -1){
//                arr[counter++] = index;
//            }
//        }while (index != -1);

    }
}
