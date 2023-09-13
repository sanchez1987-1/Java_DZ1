package org.example.environment;

public interface Animal {
    String says(); //сказать что-нибудь
    String eats(String food); //покормить
}

abstract class AnimalImpl implements Animal {

    private int size; //Размер
    private int age; //возраст
    private String color; //цвет
    private String name; //кличка
    private String ownerName; //хозяин
    private String sounds; //звук животного

    public AnimalImpl(int size, int age, String color, String name) {
        this.size = size;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getSounds() {
        return sounds;
    }

    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String eats(String food) {
        String status = new String("съедено -> " + food);
        return status;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
