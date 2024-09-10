package com.vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public Car() {
        this.speedKph = 0.0;
        this.fuelLevel = 100.0f;
        this.distanceTraveled = 0;
    }

    public void setSpeed(double speed) {
        this.speedKph = speed;
    }

    public void setFuelLevel(float fuel) {
        this.fuelLevel = fuel;
    }

    public void drive(int distance) {
        this.distanceTraveled += distance;
    }

    public double getSpeedMph() {
        return this.speedKph / 1.60934;
    }

    public int getDistanceKm() {
        return this.distanceTraveled / 1000;
    }

    public int calculateRemainingFuel(double distanceKm) {
        double fuelConsumed = distanceKm * 0.5;
        this.fuelLevel -= fuelConsumed;
        return (int) this.fuelLevel;
        //explicit conversion from a double to an int
    }
}
