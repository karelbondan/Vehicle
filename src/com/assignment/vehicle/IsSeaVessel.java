package com.assignment.vehicle;

public interface IsSeaVessel extends IsVehicle{
    int getDisplacement();
    void setDisplacement(int displacement);
    void launch();
}