package com.decentmbele.registrationsystem.repository;

import com.decentmbele.registrationsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long> {
}
