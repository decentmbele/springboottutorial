package com.decentmbele.registrationsystem.service;

import com.decentmbele.registrationsystem.model.Department;
import com.decentmbele.registrationsystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    private Department addDepartment(Department department){
        return departmentRepository.save(department);
    }

    private Department viewDepartment(long departmentId){
        return departmentRepository.getOne(departmentId);
    }

    private void deleteDepartment(long departmentId){
        departmentRepository.delete(viewDepartment(departmentId));
    }

    private List<Department> viewAllDepartment(){
        return departmentRepository.findAll();
    }
}
