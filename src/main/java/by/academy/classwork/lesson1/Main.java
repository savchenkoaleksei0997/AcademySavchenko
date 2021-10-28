package by.academy.classwork.lesson1;



public class Main {
    public static void  main (String[] args){

        Cat cat1 = new Cat();
        cat1.setWeight(8);
        cat1.setAge(5);
        cat1.setNickName("Barsik");
        System.out.println(cat1);
        cat1.walk();
    }
}
