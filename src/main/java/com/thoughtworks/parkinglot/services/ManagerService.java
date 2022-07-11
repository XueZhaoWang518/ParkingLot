package com.thoughtworks.parkinglot.services;

import com.thoughtworks.parkinglot.entity.ParkingLot;
import com.thoughtworks.parkinglot.entity.Staff;
import com.thoughtworks.parkinglot.repositories.ParkingLotRepository;
import com.thoughtworks.parkinglot.repositories.StaffRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManagerService {
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private ParkingLotRepository parkingLotRepository;

    public void addStaff(String name) {
        Staff staff = new Staff();
        staff.setName(name);
        staffRepository.save(staff);

    }

    public void addParkingLot(Integer size) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setSize(size);
        parkingLotRepository.save(parkingLot);
    }

    public void assignParkingLotToStaff(Long staffId, Long parkingLotId) {
        Optional<Staff> staff = staffRepository.findById(staffId);
        Optional<ParkingLot> parkingLot = parkingLotRepository.findById(parkingLotId);
        if (staff.isPresent() && parkingLot.isPresent()) {
            Staff staff1 = staff.get();
            ParkingLot parkingLot1 = parkingLot.get();
            staff1.addParkingLot(parkingLot1);
            staffRepository.saveAndFlush(staff1);
        }

    }

    public void deleteStaff(Long staffId) {
        Optional<Staff> staff = staffRepository.findById(staffId);
        if (staff.isPresent()) {
            staffRepository.delete(staff.get());
        }
    }

    public void deleteParkingLot(Long parkingLotId) {
        Optional<ParkingLot> parkingLot = parkingLotRepository.findById(parkingLotId);
        if (parkingLot.isPresent()) {
            parkingLotRepository.delete(parkingLot.get());
        }
    }


}
