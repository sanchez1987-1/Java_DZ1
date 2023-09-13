package org.example.environment;

public class Hare extends AnimalImpl{
    private String sounds = null;

    public Hare(int size, int age, String color, String name) {
        super(size, age, color, name);
    }

    @Override
    public String says() {
        return this.sounds;
    }
}
