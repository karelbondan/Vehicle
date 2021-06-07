package com.assignment.vehicle;

public class PoliceCar implements IsLandVehicle, IsEmergency{
    private String name, type;
    private int numWheels, maxPassengers, maxSpeed;

    public PoliceCar(String name, String type, int numWheels, int maxPassengers, int maxSpeed){
        this.name = name;
        this.type = type;
        this.numWheels = numWheels;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public PoliceCar(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void soundSiren() {
        System.out.println("nguing nguing");
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Vehicle is driving. Have a safe trip, passengers!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
