package com.thoughtworks.parkinglot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Manager {
    @Id
    private Long id;

    private String name;

}
