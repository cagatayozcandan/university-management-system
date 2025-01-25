package com.example.University.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.University.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	 
	public List<Student> findStudentsByDepartmentId(Long id);//stu service den geldi.DeptId sine göre
	//öğrencileri listeler
}
