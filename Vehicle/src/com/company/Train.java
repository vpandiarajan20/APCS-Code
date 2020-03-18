
package com.company;

public class Train extends Vehicle{
    int boxCars;
    public String toStr(){
        return "This is a train, all aboard!";
    }
    public void communicate() {
        System.out.println("I think I can, I think I can!");
    }

    public int getBoxCars() {
        return boxCars;
    }

    public void setBoxCars(int boxCars) {
        this.boxCars = boxCars;
    }
}



