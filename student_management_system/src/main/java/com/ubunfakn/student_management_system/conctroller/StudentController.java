package com.ubunfakn.student_management_system.conctroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ubunfakn.student_management_system.entity.Student;
import com.ubunfakn.student_management_system.services.StudentService;

@Controller
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String listOfAllStudents(Model model){

        model.addAttribute("students", this.studentService.getAllStudents());
        model.addAttribute("title", "Home");

        return "students";
    }

    @GetMapping("/add-form")
    public String createStudentForm(Model model){

        Student student = new Student();

        model.addAttribute("title", "Add Student");
        model.addAttribute("heading", "List New Student");
        model.addAttribute("student", student);
        model.addAttribute("btnValue", "Add Student");

        return "create_student";
    }

    @PostMapping("/save-form")
    public String saveStudent(@ModelAttribute Student student){

        this.studentService.saveStudent(student);

        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable("id")int id,Model model){
        
        model.addAttribute("title", "Update Student");
        model.addAttribute("heading", "Update Student");
        model.addAttribute("student", this.studentService.getStudentById(id));
        model.addAttribute("btnValue", "Update Student");

        return "create_student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id")int id){
        
        this.studentService.deleteStudentById(id);
        return "redirect:/";
    }
}
