package ru.rudnev.test.java;

public class Horse implements Transport {
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean drive(Terrain terrain){
        if (terrain == Terrain.SWAMP){
            System.out.println("Horse can't move at this type of terrain!");
            return false;
        }
        if (stamina - 10 < 0) {
            return false;
        }
        stamina -= 10;
        return true;
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
