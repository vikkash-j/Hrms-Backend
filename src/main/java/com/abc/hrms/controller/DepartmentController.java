package com.abc.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.hrms.beans.Department;
import com.abc.hrms.service.DepartmentService;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/createdepartment")
	public Department create(@RequestBody Department dept ) {
		return departmentService.saveDepartment(dept);
	} 
	
	@GetMapping("/getalldepartment")
	public List<Department> getAll(){
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/getdepartment/{id}")
	public Department getDeptById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	} 
	
	@PutMapping("/updatedepartment/{id}")
	public Department update(@PathVariable Long id, @RequestBody Department dept) {
		return departmentService.updateDepartment(id, dept);
		
	}
	
	@DeleteMapping("/deletedepartment/{id}")
	public void delete(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}
	
	
	

}
