package org.example.environment;

public class Elephant extends AnimalImpl{
    private String sounds = new String("Уууу");

    public Elephant(int size, int age, String color, String name) {
        super(size, age, color, name);
    }

    @Override
    public String says() {
        return this.sounds;
    }
}
