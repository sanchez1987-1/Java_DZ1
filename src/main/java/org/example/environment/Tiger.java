package org.example.environment;

public class Tiger extends AnimalImpl{
    private String sounds = new String("Ррррррррр");

    public Tiger(int size, int age, String color, String name) {
        super(size, age, color, name);
    }

    @Override
    public String says() {
        return this.sounds;
    }
}
