package org.example.technics;

public class Car extends TransportImpl{

    Motor motor = new Motor("Двигатель");
    Battery battery = new Battery("Аккумулятор");

    public Car(int wheels, int passengers, Double mileage) {
        cntWheels = wheels;
        cntPassengers = passengers;
        cntMileage = mileage;
    }

    @Override
    public void usage() {
        start();
        System.out.println("Машина поехала");
        stop();
    }

    @Override
    void start() {
        battery.install();
        motor.start();
        System.out.println("Машина завелась");
    }

    @Override
    void stop() {
        System.out.println("Машина остановилась");
        motor.stop();
        battery.uninstall();
    }


}
