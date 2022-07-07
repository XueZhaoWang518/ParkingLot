package com.thoughtworks.parkinglot.Controller.request;

import lombok.Data;

@Data
public class CreateParkingLotRequest {
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
