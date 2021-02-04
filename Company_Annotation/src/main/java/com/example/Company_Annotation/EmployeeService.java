package com.example.Company_Annotation;

import java.util.List;

import org.hibernate.Session;

public interface EmployeeService {

	// print all data Employees //
	public List<Employee> getAllEmployees(Session session);

}
