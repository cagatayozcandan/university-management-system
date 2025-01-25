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

import com.example.University.Entity.Department;
import com.example.University.Service.DepartmentService;

@RestController
@RequestMapping("departments")
public class DepartmentController {

	@Autowired
	DepartmentService deptSer;
	
	@GetMapping
	public List<Department> getDepartments(){
		return deptSer.getDepartments();
	}
	@GetMapping("{id}")
	public Optional<Department> getDepartment(@PathVariable Long id){
	return deptSer.getDepartment(id);
	}

	@PostMapping("save")
	public String saveDepartment(@RequestBody Department d) {
	return deptSer.saveDept(d);
	}

	@DeleteMapping("{id}")
	public String deleteDepartment(@PathVariable Long id) {
	return deptSer.deleteDept(id);
	}
	
	}

