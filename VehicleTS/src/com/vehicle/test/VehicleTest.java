package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car regularCar = new Car();
        regularCar.setSpeed(100.0);
        regularCar.setFuelLevel(80.0f);

        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(90.0);
        electricCar.setFuelLevel(75.0f);
        electricCar.setBatteryLevel(90.0);

        int distanceDriven = 15000;
        regularCar.drive(distanceDriven);
        electricCar.drive(distanceDriven);

        System.out.println("Regular Car:");
        System.out.println("Speed in MPH: " + regularCar.getSpeedMph());
        System.out.println("Distance traveled in KM: " + regularCar.getDistanceKm());
        System.out.println("Remaining Fuel: " + regularCar.calculateRemainingFuel(regularCar.getDistanceKm()) + "%");

        System.out.println("\nElectric Car:");
        System.out.println("Speed in MPH: " + electricCar.getSpeedMph());
        System.out.println("Distance traveled in KM: " + electricCar.getDistanceKm());
        System.out.println("Remaining Fuel: " + electricCar.calculateRemainingFuel(electricCar.getDistanceKm()) + "%");
        System.out.println("Remaining Battery: " + electricCar.getBatteryLevel() + "%");
    }
}