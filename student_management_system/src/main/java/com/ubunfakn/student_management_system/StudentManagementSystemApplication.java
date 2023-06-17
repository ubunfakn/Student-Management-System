package com.ubunfakn.student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ubunfakn.student_management_system.entity.Student;
import com.ubunfakn.student_management_system.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student();
		// student1.setName("Aachal Nashine");
		// student1.setFatherName("Achlesh Nashine");
		// student1.setMotherName("Vinita Nashine");
		// student1.setEmail("aachal2006nashine@gmail.com");
		// student1.setPhone("7000122178");

		// studentRepository.save(student1);
	}

}
