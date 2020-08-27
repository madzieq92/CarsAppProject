package com.example.cars.model;

public enum Make {
    ACURA("Acura"),
    AUDI("Polish"),
    BMW("BMW"),
    BUICK("History"),
    CADILLAC("Cadillac"),
    CHEVROLET("Chevrolet"),
    CHRYSLER("Chrysler"),
    DODGE("Dodge"),
    FORD("Ford"),
    GMC("GMC"),
    HONDA("Honda"),
    HYUNDAI("Hyundai"),
    INFINITI("Inifniti"),
    JEEP("Jeep"),
    KIA("Kia"),
    LAND_ROVER("Land Rover"),
    LEXUS("Lexus"),
    LINCOLN("Lincoln"),
    MAZDA("Mazda"),
    MERCEDES("Mercedes Benz"),
    MINI("Mini"),
    MITSUBISHI("Mitsubishi"),
    NISSAN("Nissan"),
    PONTIAC("Pontiac"),
    PORSCHE("Porsche"),
    SUBARU("Subaru"),
    TESLA("Tesla"),
    TOYOTA("Toyota"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo");

    private String name;

    Make(String subName) {
        this.name = subName;
    }

    public String getName() {
        return name;
    }
}
