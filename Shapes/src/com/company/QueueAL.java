package com.company;

import java.util.ArrayList;

public class QueueAL<E> {
    private ArrayList<E> arraylist;

    public QueueAL() {}

    public QueueAL(int a) {
        arraylist = new ArrayList<>(a);
    }

    public void enqueue(E a) {
        arraylist.add(a);
    }

    public E dequeue() {
        E rv = arraylist.get(0);
        arraylist.remove(0);
        return rv;
    }

    public void print() {
        System.out.print("{");
        for (E a: arraylist) {
            System.out.print(a + ", ");
        }
        System.out.print("}");
    }
}
