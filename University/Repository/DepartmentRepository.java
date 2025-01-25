package com.example.University.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.University.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
