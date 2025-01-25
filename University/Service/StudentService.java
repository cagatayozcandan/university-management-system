package com.example.University.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.University.Entity.Student;
import com.example.University.Repository.DepartmentRepository;
import com.example.University.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRep;
	@Autowired
	DepartmentRepository deptRep;
	
	
	public List<Student> getStudents(){
		return stuRep.findAll();
	}
	
	public Optional<Student> getStudent(Long id) {
		return stuRep.findById(id);
	}
	
	public String deleteStudent(Long id) {
		stuRep.deleteById(id);
		return "Student Deleted!";
		
	}
	
	
	public String saveStudent(Student s, Long deptId) {	
		//deptRep.findById(deptId).get().students.add(s);
		s.setDepartment(deptRep.findById(deptId).get());
		stuRep.save(s);
		return "Student Saved!";
	}

	public List<Student> getStudentsByDeptId(Long id) {
		return stuRep.findStudentsByDepartmentId(id); /*Bu metod, belirli bir departman ID'sine (deptId) ait
öğrencileri liste olarak döndürmek için tasarlanmıştır. stuRep bir StudentRepository nesnesidir
 ve findStudentsByDepartmentId metodunu çağırarak veritabanından öğrenci verilerini çeker.*/
	}

}
