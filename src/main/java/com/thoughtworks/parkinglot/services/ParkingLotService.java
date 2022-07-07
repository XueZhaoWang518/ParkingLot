package com.thoughtworks.parkinglot.services;

import com.thoughtworks.parkinglot.entity.Car;
import com.thoughtworks.parkinglot.entity.ParkingLot;
import com.thoughtworks.parkinglot.repositories.CarRepository;
import com.thoughtworks.parkinglot.repositories.ParkingLotRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@Builder
public class ParkingLotService {
    @Autowired
    private CarRepository carRepository;
    private ParkingLotRepository parkingLotRepository;

    public Page<ParkingLot> getAllParkingLots(Pageable pageable) {
        return parkingLotRepository.findAll(pageable);
    }

    public void deleteCarOffParking(String plateNum) {
        List<Car> carList = carRepository.findAll();
        Car car = carList.stream().filter(c -> c.getPlateNum().equals(plateNum)).collect(Collectors.toList()).get(0);
        carRepository.deleteById(car.getId());
    }

    public void addCarToParking(String color, String plateNum) {
        Car car = new Car();
        car.setColor(color);
        car.setPlateNum(plateNum);
        carRepository.save(car);

    }

}
