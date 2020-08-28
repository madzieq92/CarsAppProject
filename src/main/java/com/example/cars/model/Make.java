package com.example.cars.model;

public enum Make {
    AUDI("Audi"),
    BMW("BMW"),
    MERCEDES("Mercedes Benz");

    private String name;

    Make(String subName) {
        this.name = subName;
    }

    public String getName() {
        return name;
    }
}
