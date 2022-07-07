package com.thoughtworks.parkinglot.entity;


import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }
}
