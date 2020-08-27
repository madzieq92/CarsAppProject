package com.example.cars.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CarMercedes extends Car {
    private ModelMercedes model;
}