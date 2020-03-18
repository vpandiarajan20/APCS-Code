
package com.company;

public class Complex implements Copyable, Comparable, Printable{
    double a, b;
    public Complex(){};
    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double realPart() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double imaginaryPart() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double magnitude(){
        return Math.sqrt(a*a+b*b);
    }
    public int compare(Object x){
        if(((Complex)x).magnitude() > this.magnitude())
            return -1;
        if(((Complex)x).magnitude()< this.magnitude())
            return 1;
        return 0;
    }
    public Object copy(Object x) {
        Complex y = new Complex(this.a, this.b);
        return y;
    }
    public String printable(){
        return "The magnitude of this vector is " + this.magnitude();
    }
}


