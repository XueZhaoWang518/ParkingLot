package com.thoughtworks.parkinglot.Controller;

import com.thoughtworks.parkinglot.Controller.request.CreateParkingLotRequest;
import com.thoughtworks.parkinglot.Controller.request.CreateStaffRequest;
import com.thoughtworks.parkinglot.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController("r-managerController")
@RequestMapping("/managers")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/staff/")
    public void addStaff(@RequestBody CreateStaffRequest staffRequest){
        managerService.addStaff(staffRequest.getName());
    }
    @DeleteMapping("/staff/{id}")
    public void deleteStaff(@PathVariable Long id) {
       managerService.deleteStaff(id);
    }
    @PostMapping("/parkinglot/")
    public void addParkingLot(@RequestBody CreateParkingLotRequest parkingLotRequest) {
        managerService.addParkingLot(parkingLotRequest.getSize());

    }
    @DeleteMapping("/parkinglot/{id}/")
    public void deleteParkingLot(@PathVariable Long id) {
        managerService.deleteParkingLot(id);
    }

    @PostMapping("/staff/parkinglot/{staffId}/{parkingLotId}")
    public void assignParkingLotToStaff(@PathVariable Long staffId, @PathVariable Long parkingLotId) {
        managerService.assignParkingLotToStaff(staffId, parkingLotId);

    }


}
