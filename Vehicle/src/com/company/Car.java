package com.company;

public class Car extends Vehicle{
    String motorType;
    int doors;
    public String toStr(){
        return "This is a " + motorType + "car with" + doors + " doors .";
    }
    public void communicate() {
        System.out.println("Honk Honk");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoor(int x) {
        doors = x;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
