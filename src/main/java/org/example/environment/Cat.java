package org.example.environment;

public class Cat extends AnimalImpl{

    public Cat(int size, int age, String color, String name, String owner) {
        super(size, age, color, name);
        setSounds("Мяу");
        setOwnerName(owner);
    }

    @Override
    public String says() {
        return getSounds();
    }

}
