package com.decentmbele.registrationsystem.service;

import com.decentmbele.registrationsystem.model.Staff;
import com.decentmbele.registrationsystem.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    //add staff to the database
    private Staff addStaff(Staff staff){
        return staffRepository.save(staff);
    }

    //view a single record from the staff table
    private Staff viewStaff(long staffId){
        return staffRepository.getOne(staffId);
    }

    //delete a single staff record from the database
    private void deleteStaff(long staffId){
        staffRepository.delete(viewStaff(staffId));
    }

    //view staff members from the database
    public List<Staff> viewAllStaff(){
        return staffRepository.findAll();
    }
}
