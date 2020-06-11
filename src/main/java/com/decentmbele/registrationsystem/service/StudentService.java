package com.decentmbele.registrationsystem.service;

import com.decentmbele.registrationsystem.model.Staff;
import com.decentmbele.registrationsystem.model.Student;
import com.decentmbele.registrationsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //add a student to a database
    private Student addStudent(Student student){
        return studentRepository.save(student);
    }

    //view all student from the database
    public List<Student> viewAllStudents() {
        List<Student> invoices = new ArrayList<>();
        studentRepository.findAll().forEach(invoices::add);
        return invoices;
    }

    //view a single student from the database
    public Student viewInvoice(long id) {
        return studentRepository.getOne(id);
    }

    //delete a student from the database
    public void deleteStudent(long guestId){
        studentRepository.delete(viewInvoice(guestId));
    }


}
