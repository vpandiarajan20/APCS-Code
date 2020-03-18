
package com.company;

public abstract class  Shape implements Comparable {
    private final int NUMBER_OF_SIDES;

    public Shape() {
        NUMBER_OF_SIDES = 0;
    }

    public Shape(int numSides) {
        NUMBER_OF_SIDES = numSides;
    }

    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    // The toStr() method is necessary so that we can use it
    // from Shape pointers for all child classes of Shape.
    // This is the conflict and resolution.
    public String toStr() {
        return "";
    }


    public int compare(Object x) {
        if (((Shape)x).area() > this.area())
            return -1;
        if (((Shape)x).area() < this.area())
            return 1;
        return 0;
    }

    public static void bubbleSortShape(Shape[] a){
        Shape left, right, storage;
        for (int bNum = 0; bNum < a.length - 1; bNum++) {
            for (int i = 0; i < a.length - 1 - bNum; i++) {
                if (1 == a[i].compare(a[i+1])){
                    //swap
                    storage = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = storage;
                }
            }

        }
    }
}


