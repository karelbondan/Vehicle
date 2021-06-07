package com.assignment.vehicle;

public class Hovercraft implements IsSeaVessel, IsLandVehicle{
    private String name;
    private int maxPassengers, maxSpeed, displacement, numWheels;

    public Hovercraft(String name, int maxPassengers, int maxSpeed, int displacement, int numWheels) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
        this.numWheels = numWheels;
    }

    public Hovercraft(){

    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Hovercraft has been successfully launched.");
    }

    @Override
    public void drive() {
        System.out.println("Vehicle is driving. Have a safe trip, driver!");
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

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
