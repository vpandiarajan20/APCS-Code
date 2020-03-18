
package com.company;

public class Triangle extends Shape implements Comparable{
    private double sideA,sideB,sideC,base,height;
    public Triangle(){
        super(3);
        sideA = 0;
        sideB = 0;
        sideC = 0;
        base = 0;
        height = 0;
    }
    public Triangle(double a, double b, double c, double base, double height){
        super(3);
        sideA = a;
        sideB = b;
        sideC = c;
        this.base = base;
        this.height = height;
    }

    public String toStr(){
        return "Triangle with 3 sides, side lengths = " +
                sideA + "," + sideB + "," + sideC + ", base = " +
                base + ", height = " + height;
    }
    public double area() {
        return .5 * base * height;
    }
    public double perimeter(){
        return sideA + sideB + sideC;
    }
    public int compare(Object x){
        if(((Triangle)x).area() > this.area())
            return -1;
        if(((Triangle)x).area() < this.area())
            return 1;
        return 0;
    }
}


