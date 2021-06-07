package com.assignment.vehicle;

public class Frigate implements IsSeaVessel{
    private String name;
    private int maxPassengers, maxSpeed, displacement, launch;

    public Frigate(String name, int maxPassengers, int maxSpeed, int displacement, int launch) {
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
        this.launch = launch;
    }

    public Frigate(){

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
        System.out.println("Frigate has been successfully launched.");
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
