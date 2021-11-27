package by.academy.classwork.lesson11;


import by.academy.homework.homework3.Cheese;
import by.academy.homework.homework3.Product;

import java.io.Serializable;


public class CwTask <T extends CharSequence & Comparable<T>, V extends Product & Serializable, K extends Number>  {

     private T t;
     private V v;
     private K k;

     public CwTask(){
         super();
     }

     public CwTask(T t, V v, K k){
         super();
         this.t = t;
         this.v = v;
         this.k = k;
     }


    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClass (){
        System.out.println("Класс переменной t : " + t.getClass().getName());
        System.out.println("Класс переменной v : " + v.getClass().getName());
        System.out.println("Класс переменной k : " + k.getClass().getName());
    }

    public int compareTo(T t) {
        return 0;
    }

public static void main(String... args){
         CwTask<String, Product, Integer> object = new CwTask<>("Hello World", new Cheese(), 1234);

         object.printClass();
}



}
