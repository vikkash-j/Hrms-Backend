package com.abc.hrms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.hrms.beans.Department;
import com.abc.hrms.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepo;
	
	@Override
	public Department saveDepartment(Department dept) {
		
		return departmentRepo.save(dept);
	}

	@Override
	public List<Department> getAllDepartment() {
	
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long deptId) {
		
		return departmentRepo.findById(deptId).orElse(null);
	}

	@Override
	public Department updateDepartment(Long deptId, Department dept) {
		Department existing = getDepartmentById(deptId);
		
		if(existing!=null) {
			if(dept.getDepartmentName() != null){
				existing.setDepartmentName(dept.getDepartmentName());
			}
			if(dept.getLocation() != null){
				existing.setLocation(dept.getLocation());
			}
			return departmentRepo.save(existing);
		}
		return null;
	}

	@Override
	public void deleteDepartment(Long deptId) {

		departmentRepo.deleteById(deptId);
	}

}
