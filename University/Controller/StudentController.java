package com.example.University.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.University.Entity.Student;
import com.example.University.Service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	//www.mysite.com/students/all
	
	@Autowired
	StudentService stuSer;
	
	@GetMapping
	public List<Student> displayStudents(){
		return stuSer.getStudents();
	}
	
	@GetMapping("{id}")
	public Optional<Student> displayStudent(@PathVariable Long id){
		return stuSer.getStudent(id);
	}
	
	@DeleteMapping("{id}")
	public String deleteStudent(@PathVariable Long id) {
		return stuSer.deleteStudent(id);
	}
	
	@PostMapping("save/{id}")
	public String saveStudent(@RequestBody Student s, @PathVariable Long id) {
		return stuSer.saveStudent(s, id);
	}
	@GetMapping("dep/{id}")
	public List<Student> getStudentsByDeptId(@PathVariable Long id){
		return stuSer.getStudentsByDeptId(id);
	}

	
}
