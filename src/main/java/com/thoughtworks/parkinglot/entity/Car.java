package com.thoughtworks.parkinglot.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "plate_number", nullable = false)
    private String plateNum;

    public String getPlateNum() {
        return plateNum;
    }

    public Long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }
}
