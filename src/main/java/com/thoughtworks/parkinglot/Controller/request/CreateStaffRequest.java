package com.thoughtworks.parkinglot.Controller.request;

import lombok.Data;

@Data
public class CreateStaffRequest {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
