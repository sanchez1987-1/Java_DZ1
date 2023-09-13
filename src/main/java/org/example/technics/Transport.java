package org.example.technics;

public interface Transport {
    public void usage(); //использовать
}

abstract class TransportImpl implements Transport {
    int cntWheels; //количество колес
    int cntPassengers; //кол-во пассажиров
    Double cntMileage; //пробег
    String color; //цвет

    public int getCntWheels() {
        return cntWheels;
    }

    public int getCntPassengers() {
        return cntPassengers;
    }

    public Double getCntMileage() {
        return cntMileage;
    }

    public String getColor() {
        return color;
    }

    void start() //поехать
    {

    }

    void stop() //остановить
    {

    }
}