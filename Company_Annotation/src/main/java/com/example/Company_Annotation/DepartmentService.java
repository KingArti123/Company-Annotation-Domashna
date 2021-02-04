package com.example.Company_Annotation;

import java.util.List;

import org.hibernate.Session;

public interface DepartmentService {
	
	List<Department> findAllDepartment(Session session);

}
