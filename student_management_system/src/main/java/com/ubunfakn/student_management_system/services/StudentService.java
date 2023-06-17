package com.ubunfakn.student_management_system.services;

import java.util.List;

import com.ubunfakn.student_management_system.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(int id);
    void deleteStudentById(int id);
}
