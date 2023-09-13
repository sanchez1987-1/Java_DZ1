package org.example.environment;

public class Dog extends AnimalImpl{
    private String sounds = new String("Гав");

    public Dog(int size, int age, String color, String name, String owner) {
        super(size, age, color, name);
        setOwnerName(owner);
    }

    @Override
    public String says() {
        return this.sounds;
    }

}
