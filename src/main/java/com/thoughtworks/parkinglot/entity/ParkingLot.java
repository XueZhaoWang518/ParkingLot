package com.thoughtworks.parkinglot.entity;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "parking_lot")
public class ParkingLot {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer size;

    @OneToMany
    @JoinColumn(name="parking_lot_id")
    private List<Car> cars;


}
