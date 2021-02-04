package com.example.Company_Annotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public List<Department> findAllDepartment(Session session){
		
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
//			Session session = factory.openSession();
			Transaction tx = null;
			List<Department> result = new ArrayList<Department>();

			try {
				tx = session.beginTransaction();
				List<Department> departments = session.createQuery("FROM Department").list();

				for (Department department : departments) {

					System.out.println("Dept id: " + department.getDnumber());
					System.out.println("Department name: " + department.getDname());
					System.out.println("Number of employees: " + department.getMgr_ssn());
					System.out.println("Project name: " + department.getMgr_start_date());

					result.add(department);
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
