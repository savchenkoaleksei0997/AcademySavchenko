package by.academy.classwork.lesson10;

public class GenericBox<T> {

    private T[] items;
    private int size;

    public GenericBox(){
        super();
        this.items = (T[]) new Object[10];
    }

    public GenericBox(int capacity){
        super();
        this.items = (T[]) new Object[capacity];
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
