package com.company;

public class Circle extends Shape implements Comparable, Copyable{
    private double radius;
    private Point center;
    public Circle(){
        super(1);
        radius = 0;
        center = new Point(0,0);
    }
    public Circle(double radius, double x, double y){
        super(1);
        this.radius = radius;
        center = new Point((int)x,(int)y);
    }
    public String toStr(){
        return "Circle with 1 side, radius = " +
                radius + " and center = " +
                center.toString();
    }
    public double area() {
        return 3.14 * radius *  radius;
    }
    public double perimeter(){
        return 6.28 * radius;
    }
    public Object copy(Object x) {
        Circle y = new Circle(this.radius, this.center.getX(), this.center.getY());
        return y;
    }
    public int compare(Object x){
        if(((Circle)x).radius > this.radius)
            return -1;
        if(((Circle)x).radius < this.radius)
            return 1;
        return 0;
    }
    public static void bubbleSortCircle(Circle[] a){
        Circle left, right, storage;
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
