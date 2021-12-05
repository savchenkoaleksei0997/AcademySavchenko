package by.academy.homework.homework4.HwTask2;

public class MineHW4x2 {
    public static void main(String... args){

        HomeWork4x2 arr = new HomeWork4x2(1);

        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";

        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        arr.printLastIndextObject();
        arr.printArray();

        System.out.println(arr.getObjectIndex(2));



    }
}
