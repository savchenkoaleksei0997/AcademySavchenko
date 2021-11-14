package by.academy.additionalTasks.stringsTask;

import java.util.Scanner;

public class Task4classwork {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
        String[] str = {"String", "Practice", "code"};
        int c;

        for (int i = 0; i < str.length; i++){
            c = (str[i].length() / 2) - 1;
            System.out.println();
            for (int j =0; j < 2; j++){
                System.out.print(str[i].charAt(c));
                c++;
            }
        }



    }
}
