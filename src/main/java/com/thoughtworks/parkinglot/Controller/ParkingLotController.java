package com.thoughtworks.parkinglot.Controller;

import com.thoughtworks.parkinglot.Controller.request.CreateCarRequest;
import com.thoughtworks.parkinglot.entity.ParkingLot;
import com.thoughtworks.parkinglot.entity.Staff;
import com.thoughtworks.parkinglot.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingLots")
public class ParkingLotController {
    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping
    public Page<ParkingLot> getParkingLots(@PageableDefault Pageable pageable) {
        return parkingLotService.getAllParkingLots(pageable);

    }

    @PostMapping
    public void addCarToParking(@RequestBody CreateCarRequest carRequest) {
        parkingLotService.addCarToParking(carRequest.getColor(), carRequest.getPlateNum());

    }
    @DeleteMapping
    public void deleteCarOffParking(@RequestBody CreateCarRequest carRequest){
        parkingLotService.deleteCarOffParking(carRequest.getPlateNum());
    }
}
