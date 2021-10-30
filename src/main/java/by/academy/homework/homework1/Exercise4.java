package by.academy.homework.homework1;

public class Exercise4 {
    public static void main (String[] args){

        for (int i = 2;;){
            i *= 2;
            if (i < 1000000) {
                System.out.println(i);
            }else
                break;
        }
    }
}
