package com.thoughtworks.parkinglot.entity;


import javax.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name="staff_id")
    private List<ParkingLot> parkingLots;

    public void addParkingLot(ParkingLot parkingLot) {
        this.parkingLots.add(parkingLot);
    }
}
