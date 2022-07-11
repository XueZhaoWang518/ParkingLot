package com.thoughtworks.parkinglot.Controller;

import com.thoughtworks.parkinglot.Controller.request.CreateCarRequest;
import com.thoughtworks.parkinglot.entity.Staff;
import com.thoughtworks.parkinglot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping
    public Page<Staff> getStaffs(@PageableDefault Pageable pageable) {
        return staffService.getAllStaff(pageable);

    }
    @PostMapping("/{parkingLotId}")
    public void addCarToParkingLot(@RequestBody CreateCarRequest carRequest , @PathVariable Long parkingLotId) {
        staffService.addCarToParkingLot(carRequest.getPlateNum(), parkingLotId);
    }

}
