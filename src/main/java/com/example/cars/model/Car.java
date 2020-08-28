package com.example.cars.model;

import lombok.*;

import javax.persistence.*;
import java.awt.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    private Make make;
    private CarModel model;
    private CarStyle carStyle;
    private int year;
    private double distance;
    private int power;
    private CarEngine carEngine;
    private double price;
    private Color exteriorColor;
    private Color interiorColor;
    private boolean metallic;


}
