package com.example.Company_Annotation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Company_Annotation.Department;
import com.example.Company_Annotation.Employee;
import com.example.Company_Annotation.EmployeeService;
import com.example.Company_Annotation.EmployeeServiceImpl;
import com.example.Company_Annotation.Project;
import com.example.Company_Annotation.WorksOnID;

public class App {

	static SessionFactory factory;

	public static void main(String[] args) {

		Transaction tx = null;

		try {
			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(com.example.Company_Annotation.Employee.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.EmployeeService.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.EmployeeServiceImpl.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.Department.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.DeptLocationID.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.DeptLocation.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.Project.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.WorksOnID.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.WorksOn.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.DependentID.class);
			cfg.addAnnotatedClass(com.example.Company_Annotation.Dependent.class);
			cfg.configure();
			factory = cfg.configure().buildSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();

			// Insert Employee //

			String date = "2020-08-16";
			Date specificdate = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date formated = dateFormat.parse(date);

			Employee emp = new Employee("Sashko", "J", "Klimkarov", date, "I Komuna", "M", 50000);
			emp.setSuper_ssn(emp);
			session.save(emp);
			
			Employee emp1 = new Employee("Zarko", "J", "Klimkarov", date, "I Komuna", "M", 52000);
			emp1.setSuper_ssn(emp1);
			session.save(emp1);
			
			Employee emp2 = new Employee("Daniel", "V", "Atanasov", date, "Kosturska", "M", 25000);
			emp2.setSuper_ssn(emp2);
			session.save(emp2);
			
			
			// Insert Department //
			
			String date1 = "2020-08-16";
			Date specificdate1 = new Date();
			SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
			Date formated1 = dateFormat1.parse(date);
			
			Department dep = new Department("Depart", date1);
			dep.setMgr_ssn(emp);
			emp.setDno(dep);
			session.save(dep);
			
			Department dep1 = new Department("Depart1", date1);
			dep1.setMgr_ssn(emp1);
			emp1.setDno(dep1);
			session.save(dep1);
			
			Department dep2 = new Department("Depart2", date1);
			dep2.setMgr_ssn(emp2);
			emp2.setDno(dep2);
			session.save(dep2);
			
		
			// Insert Project //
			
           Project pro = new Project("Project1", "Veles", dep);
           session.save(pro);
           
           Project pro1 = new Project("Project2", "SK", dep1);
           session.save(pro1);
           
           Project pro2 = new Project("Project3", "BT", dep2);
           session.save(pro2);

			// Insert WorksOnID i WorksOnID//

           WorksOnID woID = new WorksOnID(emp, pro);
           session.save(woID);
           
           WorksOnID woID1 = new WorksOnID(emp1, pro1);
           session.save(woID1);
           
           WorksOnID woID2 = new WorksOnID(emp2, pro2);
           session.save(woID2);
           
           WorksOn wo = new WorksOn(woID, 25.5);
           session.save(wo);
           
           WorksOn wo1 = new WorksOn(woID1, 25.5);
           session.save(wo1);
           
           WorksOn wo2 = new WorksOn(woID2, 25.5);
           session.save(wo2);
			
			

			EmployeeService ES = new EmployeeServiceImpl();
			ES.getAllEmployees(session);
			
			DepartmentService DS = new DepartmentServiceImpl();
		    DS.findAllDepartment(session);	

			tx.commit();
			session.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
