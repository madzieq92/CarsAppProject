package com.example.cars.model;

public enum CarEngine {
    E1_0("1.0"),
    E1_2("1.2"),
    E1_4("1.4"),
    E1_6("1.6"),
    E1_8("1.8"),
    E2_0("2.0"),
    E2_2("2.2"),
    E2_5("2.5"),
    E2_8("2.8"),
    E3_0("3.0"),
    E3_5("3.5"),
    E4_0("4.0"),
    E5_0("5.0");

    private String name;

    CarEngine(String subName) {
        this.name = subName;
    }

    public String getName() {
        return name;
    }
}
