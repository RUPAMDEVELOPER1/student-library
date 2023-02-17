package MajorProject1com.example.Student_LbraryManagmentSystem.Controllers;

import MajorProject1com.example.Student_LbraryManagmentSystem.Models.Student;
import MajorProject1com.example.Student_LbraryManagmentSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }
}
