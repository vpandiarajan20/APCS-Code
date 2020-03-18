package com.company;

public class Airplane extends Vehicle {
    String flightNumber;
    public String toStr(){
        return "This is an airplane, flight number " + flightNumber + " .";
    }
    public void communicate() {
        System.out.println("Tower, this is flight " + flightNumber + ". Requesting permission to land.");
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
