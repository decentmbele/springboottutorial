package com.decentmbele.registrationsystem.repository;

import com.decentmbele.registrationsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
