package com.abc.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.hrms.beans.Employee;
import com.abc.hrms.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee saveEmployee(Employee emp) {

		return employeeRepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long empId) {

		return employeeRepo.findById(empId).orElse(null);
	}

	@Override
	public Employee updateEmployee(Long empId, Employee emp) {
		Employee existing = getEmployeeById(empId);

		if (existing != null) {
			if (emp.getEmployeeName() != null) {

				existing.setEmployeeName(emp.getEmployeeName());
			}
			if (emp.getDepartmentId() != null) {

				existing.setDepartmentId(emp.getDepartmentId());
			}
			return employeeRepo.save(existing);
		}
		return null;

	}

	@Override
	public void deleteEmployee(Long empId) {
		employeeRepo.deleteById(empId);

	}

}
