
package com.company;

public class Rectangle extends Shape implements Comparable{
    private double length;
    private double width;
    public Rectangle(){
        super(4);
        length = 0;
        width = 0;
    }
    public Rectangle(double l, double w){
        super(4);
        length = l;
        width = w;
    }
    public String toStr(){
        return "Rectangle with 4 sides, length = " +
                length + " and width = " +
                width;
    }
    public double parentArea() {
        // super(1);
        return super.area();
    }
    public double area() {
        return length * width;
    }
    public double perimeter(){
        return length + length + width + width;
    }
    public int compare(Object x){
        if(((Rectangle)x).area() > this.area())
            return -1;
        if(((Rectangle)x).area() < this.area())
            return 1;
        return 0;
    }
}


