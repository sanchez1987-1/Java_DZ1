package org.example.technics;

public class Motor extends TransportParts{
    public Motor(String partName) {
        super(partName);
    }

    public void start() {
        System.out.printf("%s запущен\n", getPartName());
    }

    public void stop() {
        System.out.printf("%s остановлен\n", getPartName());
    }
}
