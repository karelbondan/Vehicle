package com.assignment.vehicle;

public class Jeep implements IsLandVehicle {
    private String name;
    private int numWheels, maxPassengers, maxSpeed;

    public Jeep(String name, int numWheels, int maxPassengers, int maxSpeed){
        this.name = name;
        this.numWheels = numWheels;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public Jeep(){

    }

    public void soundHorn(){
        System.out.println("Honk honk! Get out of the way people!");
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
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
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
