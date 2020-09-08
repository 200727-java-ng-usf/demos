package com.revature;

import com.revature.model.Employee;
import com.revature.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Objects;

public class AppDriver {
	public static void main(String[] args) {
		HibernateTest();
		Queries();
		Criterias();
		NamedQueries();
	}

	public static void HibernateTest(){
		Transaction tx = null;
		try (Session session = Objects.requireNonNull(HibernateSessionFactory.getInstance()).openSession()) {
			tx = session.beginTransaction();
			Query query = session.createQuery("FROM com.revature.model.Employee", Employee.class);
			List<Employee> employees = query.list();
			for (Employee e : employees) {
				System.out.println("Entry: "
						+ e.getFirstname() + " "
						+ e.getLastname() + " "
						+ e.getSalary());
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		}

	}

	public static void Queries(){
		Session session = HibernateSessionFactory.getInstance().openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			//HQL
		    Query<Employee> employeeQuery = session.createQuery("from Employee", Employee.class);
		    List<Employee> lst = employeeQuery.list();
		    lst.forEach((Employee e) -> {
				System.out.println("Entry: "
						+ e.getFirstname() + " "
						+ e.getLastname() + " "
						+ e.getSalary());
			});

			tx.commit();
			tx = session.beginTransaction();

		    // Native Query
			System.out.println();
			Query<Employee> nativeQuery = session.createNativeQuery(
					"select * from hibernatetest.employees",
					Employee.class);
			lst = nativeQuery.list();
			lst.forEach((Employee e) -> {
				System.out.println("Entry: "
						+ e.getFirstname() + " "
						+ e.getLastname() + " "
						+ e.getSalary());
			});

			tx.commit();
			tx = session.beginTransaction();

			// Getting a single employee
			Employee myEmp = session
				.createNativeQuery("select * from hibernatetest.employees e where e.id = 5", Employee.class)
				.getSingleResult();
			System.out.println("Employee: " + myEmp.getFirstname() + " " + myEmp.getLastname());

			// Parameterized query
//			List<Employee> lst2 = session
//					.createNativeQuery("");
			tx.commit();
		} catch(Exception e) {
			if (tx != null) tx.rollback();
		    e.printStackTrace();
		}finally{
			session.close();
		}
	}
	public static void Criterias() {
		Transaction tx = null;
		try (Session session = Objects.requireNonNull(HibernateSessionFactory.getInstance()).openSession()) {
			tx = session.beginTransaction();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
			Root<Employee> root = query.from(Employee.class);
			query.select(root).where(cb.equal(root.get("id"), 5));
			Employee e = session.createQuery(query).getSingleResult();
			System.out.println(e);

//			Query query = session.createQuery("FROM com.revature.model.Employee", Employee.class);
//			List<Employee> employees = query.list();
//			for (Employee e : employees) {
//				System.out.println("Entry: "
//						+ e.getFirstname() + " "
//						+ e.getLastname() + " "
//						+ e.getSalary());
//			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		}

	}

	public static void NamedQueries(){
		Session session = HibernateSessionFactory.getInstance().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			Employee e = session.createNamedQuery("getEmployeeById", Employee.class)
					.setParameter("id", 6)
					.getSingleResult();
			System.out.println("Employee: " + e.getFirstname() + " " + e.getLastname());

			tx.commit();
		} catch (Exception e) {
			if (tx != null) tx.rollback();
			e.printStackTrace();
		}
	}

}
