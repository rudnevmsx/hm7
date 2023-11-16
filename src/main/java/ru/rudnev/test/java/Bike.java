package ru.rudnev.test.java;

public class Bike implements Transport {
    @Override
    public boolean drive(Terrain terrain){
        if (terrain == Terrain.SWAMP){
            System.out.println("Bike can't move at this type of terrain!");
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Bike";
    }
}
