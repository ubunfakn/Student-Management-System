package com.ubunfakn.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubunfakn.student_management_system.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
    
    Student findById(int id);
}
