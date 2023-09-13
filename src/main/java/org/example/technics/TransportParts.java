package org.example.technics;

abstract class TransportParts {
    private String partName;

    public TransportParts(String partName) {
        this.partName = partName;
    }

    public String getPartName() {
        return partName;
    }
}