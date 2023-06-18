package com.ubunfakn.student_management_system.services.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubunfakn.student_management_system.entity.Student;
import com.ubunfakn.student_management_system.repository.StudentRepository;
import com.ubunfakn.student_management_system.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {

        return this.studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return this.studentRepository.findById(id);
    }

    @Override
    public void deleteStudentById(int id) {
         this.studentRepository.delete(this.studentRepository.findById(id));
    }
    
}
