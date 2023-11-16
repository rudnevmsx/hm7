package ru.rudnev.test.java;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("John");
        Car car = new Car(100);
        human.usedTransport(car);
        human.move(Terrain.FOREST);
    }



}