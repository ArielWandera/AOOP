package com.vehicle;
public class ElectricCar extends com.vehicle.Car {
    private double batteryLevel;

    public ElectricCar() {
        super();
        this.batteryLevel = 100.0;
    }

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        double distanceKm = distance / 1000.0;
        this.batteryLevel -= (distanceKm / 10.0);
    }

}