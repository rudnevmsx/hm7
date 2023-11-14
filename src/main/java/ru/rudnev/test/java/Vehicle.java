package ru.rudnev.test.java;

public class Vehicle implements Transport {
    private int fuel;

    public Vehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean drive(Terrain terrain){
        this.fuel = fuel - 10;
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle";
    }
}
