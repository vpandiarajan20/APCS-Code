package com.company;

public class Vehicle {
    int numberOfPassengers, numberOfSeats, topSpeed;
    Point currentPosition = new Point();
    Point destination = new Point();
    public void communicate() {
        System.out.println("Hey YOU!");
    }
    public String toStr(){
        return "This is a vehicle.";
    }
    public int speedCompareTo(Vehicle v){
        return topSpeed - v.topSpeed;
    }
    public int speedCompareTo(Airplane v){
        return topSpeed - v.topSpeed;
    }
    public int speedCompareTo(Car v){
        return topSpeed - v.topSpeed;
    }
    public int speedCompareTo(Train v){
        return topSpeed - v.topSpeed;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Point getDestination() {
        return destination;
    }

    public void setDestination(Point destination) {
        this.destination = destination;
    }
    //You need these 4 methods in order to make sure that the functions will accept any of these variables.
    //Since they are overloaded they will all be inherited with no problems.
    //This cannot work the other way around because the methods must be able to compare speeds of all objects, if they were in the classes, then they would not all be inherited.
    //There would be conflicts when comparing subclasses since they would nto be properly overloaded.
}

