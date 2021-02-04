package com.example.Company_Annotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getAllEmployees(Session session) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
		Transaction tx = null;
		List<Employee> result = new ArrayList<Employee>();

		try {
			tx = session.beginTransaction();
			List<Employee> employees = session.createQuery("FROM Employee").list();

			for (Employee employee : employees) {

				System.out.println("Employee id: " + employee.getSsn());
				System.out.println("name: " + employee.getFname());
				System.out.println( employee.getLname());
				System.out.println( employee.getBdate());
				System.out.println( employee.getAddress());
				System.out.println( employee.getSex());
				System.out.println( employee.getSalary());
				System.out.println( employee.getMinit());
				System.out.println( employee.getSuper_ssn());

				result.add(employee);
			}

			tx.commit();

		} catch (HibernateException e) {
			System.out.println(e);
			tx.rollback();
		} finally {
			session.close();
			return result;
		}

	}
	}


