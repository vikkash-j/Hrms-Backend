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
import com.abc.hrms.beans.Employee;
import com.abc.hrms.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:3000")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/createdemployee")
	public Employee create(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/getemployee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/updateemployee/{id}")
	public Employee update(@PathVariable Long id, @RequestBody Employee dept) {
		return employeeService.updateEmployee(id, dept);
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	public void delete(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
	}
	
	

}
