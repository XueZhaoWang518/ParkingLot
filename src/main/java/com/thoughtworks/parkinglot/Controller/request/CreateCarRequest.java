package com.thoughtworks.parkinglot.Controller.request;

import lombok.Data;

@Data
public class CreateCarRequest {
    private String color;
    private String plateNum;

    public String getColor() {
        return color;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
