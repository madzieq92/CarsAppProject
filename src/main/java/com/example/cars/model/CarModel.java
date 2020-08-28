package com.example.cars.model;

public enum CarModel {
    S6("Audi", "S6"),
    S8("Audi", "S8"),
    E46("BMW", "E46"),
    E38("BMW", "E36"),
    SMG_SL("Mercedes", "SMG SL");

    private String manufacturer;
    private String name;

    private CarModel(String manufacturer, String subName) {
        this.manufacturer = manufacturer;
        this.name = subName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }
}
