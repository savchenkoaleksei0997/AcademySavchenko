package by.academy.classwork.lesson13;

public class CustomLinkedList<T> {

    Node last;
    Node ferst;
    int size;

    public void add(T value) {
        Node next = null;
        Node prev = last;

        Node newNode = new Node(value, next, prev);
        if (prev == null) {
            last = newNode;
            ferst = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }

    public void add(int index, T value) {
        if (index >= size) {
            System.err.println("Index больше size");
            return;
        }
        size++;

        if (size == index + 1) {
            add(value);
        } else {
            Node replaceNode3 = getNode(index);
            Node prev7 = replaceNode3.prev;
            Node newNode8 = new Node(value, prev7, replaceNode3);
            prev7.next = newNode8;
            replaceNode3.prev = newNode8;
        }
    }

    private Node getNode(int index) {
        if (index >= size) {
            System.err.println("Index больше size");
            return null;
        }
        int counter = 0;
        Node courrent = ferst;
        while (courrent != null && counter <= index) {
            if (index == counter) {
                return courrent;
            }
            courrent = courrent.next;
            counter++;
        }
        return null;
    }

    public T getIndex(int index) {
        return getNode(index).value;
    }

    private Node getNode(T object) {
        Node courrent = ferst;
        while (courrent != null) {
            if (courrent.equals(object)) {
                return courrent;
            }
            courrent = courrent.next;
        }
        return null;
    }

    public T getObject(T object) {
        return getNode(object).value;
    }

    public void remove(int index) {

    }

    public void remove(T object) {

    }

    class Node {
        T value;
        Node next;
        Node prev;

        Node(T value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
