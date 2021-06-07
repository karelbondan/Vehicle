package com.assignment.vehicle;

public interface IsLandVehicle extends IsVehicle{
    int getNumWheels();
    void setNumWheels(int numWheels);
    void drive();
}
