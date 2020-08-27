package com.example.cars.model;

import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.ui.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

}
