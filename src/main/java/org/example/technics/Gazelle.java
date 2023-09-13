package org.example.technics;

public class Gazelle extends Car{

    public Gazelle(int wheels, int passengers, Double mileage) {
        super(wheels, passengers, mileage);
    }

    @Override
    public void usage() {
        start();
        System.out.println("Повезли груз");
        stop();
    }
}
