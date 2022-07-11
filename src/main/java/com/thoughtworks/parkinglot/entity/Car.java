package com.thoughtworks.parkinglot.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "plate_number", nullable = false)
    private String plateNum;

}
