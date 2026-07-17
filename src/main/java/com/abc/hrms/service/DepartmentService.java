package com.abc.hrms.service;

import java.util.List;

import com.abc.hrms.beans.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department dept);
	
	public List<Department> getAllDepartment();
	
	public Department getDepartmentById(Long deptId);
	
	public Department updateDepartment(Long deptId, Department dept);
	
	public void deleteDepartment(Long deptId);

}
