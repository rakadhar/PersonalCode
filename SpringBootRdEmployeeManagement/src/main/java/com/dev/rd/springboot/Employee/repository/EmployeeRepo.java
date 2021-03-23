package com.dev.rd.springboot.Employee.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.dev.rd.springboot.Employee.model.Employee;

	@Repository
	public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	}
