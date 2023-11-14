package ru.rudnev.test.java;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }
    @Override
    public boolean drive(Terrain terrain){
        if (terrain.equals(Terrain.FOREST) || terrain.equals(Terrain.SWAMP)){
            System.out.println("Car can't drive at this type of terrain!");
            return false;
        }
        else {
            this.fuel = fuel - 10;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Car";
    }
}
