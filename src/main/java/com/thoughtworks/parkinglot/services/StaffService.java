package com.thoughtworks.parkinglot.services;

import com.thoughtworks.parkinglot.entity.Car;
import com.thoughtworks.parkinglot.entity.ParkingLot;
import com.thoughtworks.parkinglot.entity.Staff;
import com.thoughtworks.parkinglot.repositories.CarRepository;
import com.thoughtworks.parkinglot.repositories.ParkingLotRepository;
import com.thoughtworks.parkinglot.repositories.StaffRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
public class StaffService {
    @Autowired
    ParkingLotRepository parkingLotRepository;
    @Autowired
    CarRepository carRepository;
    @Autowired
    StaffRepository staffRepository;

    public void addCarToParkingLot(String plateNum, Long parkingLotId) {
        Optional<ParkingLot> parkingLot = parkingLotRepository.findById(parkingLotId);
        List<Car> carList = carRepository.findAll();
        Car car = carList.stream().filter(a -> a.getPlateNum().equals(plateNum)).collect(Collectors.toList()).get(0);
        if (parkingLot.isPresent()) {
            parkingLot.get().getCars().add(car);
        }

    }
    public void deleteCarToParkingLot(Long carId, Long parkingLotId) {
        Optional<ParkingLot> parkingLot = parkingLotRepository.findById(parkingLotId);
        Optional<Car> car = carRepository.findById(carId);
        if (parkingLot.isPresent() && car.isPresent()) {
            parkingLot.get().getCars().remove(car.get());
        }
    }

    public Page<Staff> getAllStaff(Pageable pageable) {
        return staffRepository.findAll(pageable);
    }
}
