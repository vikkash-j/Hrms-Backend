package com.abc.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.hrms.beans.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	

}
