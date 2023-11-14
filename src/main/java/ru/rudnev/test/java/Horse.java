package ru.rudnev.test.java;

public class Horse implements Transport {
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean drive(Terrain terrain){
        if (terrain.equals(Terrain.SWAMP)){
            System.out.println("Horse can't move at this type of terrain!");
            return false;
        }
        else {
            this.stamina = stamina - 10;
            System.out.println("Done");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
