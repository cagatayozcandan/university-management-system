package com.example.University.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.University.Entity.Department;
import com.example.University.Repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository deptRep; //önce repositorye bağlandı
	
	public List<Department> getDepartments() { //tüm bölümleri okumak için
		return deptRep.findAll();
	}
	
	public Optional<Department> getDepartment(Long id){
		return deptRep.findById(id);
	}

	public String deleteDept(Long id) {
		deptRep.deleteById(id);
		return "Department Deleted!";

	}

	public String saveDept(Department d) {
		deptRep.save(d);
		 return "Department Saved!";

	}

	
	
	
}
