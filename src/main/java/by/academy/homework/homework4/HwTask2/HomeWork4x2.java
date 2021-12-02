package by.academy.homework.homework4.HwTask2;

import java.util.Arrays;

public class HomeWork4x2<T> {
    private T[] arrT;
    int size;

    public HomeWork4x2() {
        super();
        this.arrT = (T[]) new Object[16];
    }

    public HomeWork4x2(int capacity) {
        super();
        this.arrT = (T[]) new Object[capacity];
    }

    public T[] getArrT() {
        return arrT;
    }

    public void setArrT(T[] arrT) {
        this.arrT = arrT;
    }

    public void add(T object) {
        if (size + 1 == arrT.length) {
            Arrays.copyOf(arrT, (arrT.length * 2 + 1));
        }
        arrT[size++] = object;
    }

    public T getObjectIndex(int index) {
        return arrT[index];
    }

    public T getLastObject() {
        return arrT[arrT.length - 1];
    }

    public T getFirsObject() {
        return arrT[0];
    }

    public void printArray(){
        System.out.println("Массив размеров : " + arrT.length);
    }

    public void printLastIndextObject(){
        int index = 0;
        for (int i = 0; i < arrT.length; i++){
            if (arrT[i] != null){
                index = i;
            }
        }
        System.out.println("Индекс последнего заполненного элемента - " + index);
    }

    public void removeOfIndex(int index){
        arrT[index] = null;
    }

}

