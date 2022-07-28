package Aircraft;

import java.lang.reflect.Constructor;

public class aircraftModel {
    int aircraftVersion;  // version type
    int passengers;       // number of people
    int size;             // carrier size
    int cruiseSpeed;      // miles per hour
    double fuelCapacity;  // gallons
    double fuelBurnRate;  // miles per hour


    public int getAircraftVersion() {
        return aircraftVersion;
    }

    public void setAircraftVersion(int aircraftVersion) {
        this.aircraftVersion = aircraftVersion;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelBurnRate() {
        return fuelBurnRate;
    }

    public void setFuelBurnRate(double fuelBurnRate) {
        this.fuelBurnRate = fuelBurnRate;
    }

    public aircraftModel(int aircraftVersion, int passengers, int size, int cruiseSpeed, double fuelCapacity, double fuelBurnRate) {
        this.aircraftVersion = aircraftVersion;
        this.passengers = passengers;
        this.size = size;
        this.cruiseSpeed = cruiseSpeed;
        this.fuelCapacity = fuelCapacity;
        this.fuelBurnRate = fuelBurnRate;
    }
}
