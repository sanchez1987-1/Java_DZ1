package org.example.technics;

public class Battery extends TransportParts {
    public Battery(String partName) {
        super(partName);
    }

    public void install() {
        System.out.printf("%s подключен\n", getPartName());
    }

    public void uninstall() {
        System.out.printf("%s отключен\n", getPartName());
    }
}
