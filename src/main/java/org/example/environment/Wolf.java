package org.example.environment;

public class Wolf extends AnimalImpl{
    private String sounds = new String("Ррррр");

    public Wolf(int size, int age, String color, String name) {
        super(size, age, color, name);
    }

    @Override
    public String says() {
        return this.sounds;
    }
}
