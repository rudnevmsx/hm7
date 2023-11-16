package ru.rudnev.test.java;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void usedTransport(Transport transport){
        this.currentTransport = transport;
    }

    //When I wrote this, only God and I understood what I was doing
    public boolean move(Terrain terrain){
        //Now, God only knows
        if (terrain != Terrain.NULL) {
            boolean success = currentTransport.drive(terrain);
            if (success) {
                System.out.println(name + " moved successfully with " + currentTransport.toString());
                return true;
            }
            else {
                System.out.println(name + " didn't move with " + currentTransport.toString());
                return false;
            }
        }
        else {
            System.out.println(name + " walked by his/her feet");
            return true;
        }
    }

}
