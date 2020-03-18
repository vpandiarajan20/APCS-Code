package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car TeslaR = new Car();
        TeslaR.setNumberOfPassengers(3);
        TeslaR.setNumberOfSeats(4);
        TeslaR.setDoor(2);
        TeslaR.setMotorType("Electric");
        TeslaR.setTopSpeed(120);
        Airplane A380 = new Airplane();
        A380.setNumberOfPassengers(760);
        A380.setNumberOfSeats(762);
        A380.setFlightNumber("WB1507");
        A380.setTopSpeed(400);
        Car Lambo = new Car();
        Lambo.setNumberOfPassengers(3);
        Lambo.setNumberOfSeats(4);
        Lambo.setDoor(2);
        Lambo.setMotorType("V6");
        Lambo.setTopSpeed(100);

        Train Maglev = new Train();
        Maglev.setBoxCars(7);
        Maglev.setTopSpeed(603);


    }
}

