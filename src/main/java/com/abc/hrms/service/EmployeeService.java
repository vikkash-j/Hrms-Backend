package com.abc.hrms.service;

import java.util.List;

import com.abc.hrms.beans.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Long empId);
	
	public Employee updateEmployee(Long empId, Employee emp);
	
	public void deleteEmployee(Long empId);
	
	
}
