package Utils;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Models.*;

public class App {
	public static void main(String[] args) {
		// HibernateTest();
		// Queries();
		// Criteria();
		NamedQueries();
	}
	
	public static void HibernateTest() {
		Session session = 
				//HibernateUtils.getSessionFactoryFileConfig().openSession();
				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
		
		User testuser = new User();
		testuser.setFirstName("Jorge");
		testuser.setLastName("Murphy");
		testuser.setId(10);
		testuser.setEmailAddress("jorgem@mail.com");
		
		Transaction tx = null;

		try {
		   tx = session.beginTransaction();
		   
		   // We can save our testuser!
		   session.save(testuser);
		   
		   // We can retrieve a user with id 5!
		   User ramesh = session.get(User.class, 5);
		   System.out.println("Ramesh's id: " + ramesh.getId());
		   
		   // We can retrieve a list of all users from the database!
		   List<User> users = session.createQuery("FROM User", User.class).list();
		   for (User u : users) {
			   System.out.println("Entry: " + u.getFirstName() + " " + 
					   u.getLastName() + ", " + u.getEmailAddress()
					   + ", Id: " + u.getId());
		   }
		   
		   // We can delete testuser because it has its primary key set!
		   session.delete(testuser);
		   
		   
		   
		   tx.commit();
		}

		catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}

	public static void Queries() {
		Session session = 
				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
		
		Transaction tx = null;
		
		try {
			List<Employee> lst;
			
			// HQL
			Query<Employee> employeeQuery = session.createQuery("from Employee", Employee.class);
			lst = employeeQuery.list();
			
			
			
			// Native query
			Query<Employee> nativeQuery = session.createNativeQuery("select * from employees", Employee.class);
			lst = nativeQuery.list();
			
			lst.forEach( (Employee e) -> {
				//System.out.println("Employee: " + e.firstName + " " + e.lastName);
			});
			
			// Getting a single Employee
			Employee myEmp = session
					.createNativeQuery("select * from employees where employees.id = 5", Employee.class)
					.getSingleResult();
			//System.out.println("Employee: " + myEmp.firstName + " " + myEmp.lastName);
			
			// Parameterized query
			List<Employee> lst2 = session
					.createQuery("from Employee where id = :id", Employee.class)
					.setParameter("id", 5)
					.getResultList();
			System.out.println("Employee: " + lst2.get(0).firstName + " " + lst2.get(0).lastName);
			
		} catch (Exception e) {
			   if (tx!=null) tx.rollback();
			   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}

	public static void Criteria() {
		Session session = 
				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
		Transaction tx = null;
		
		try {
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
			Root<Employee> root = query.from(Employee.class);
			query.select(root)
				.where(cb.equal(root.get("id"), 5));
			
			Employee e = session.createQuery(query).getSingleResult();
			System.out.println("Employee: " + e.firstName + " " + e.lastName);
			
		} catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}

	public static void NamedQueries() {
		Session session = 
				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
		Transaction tx = null;
		
		try {
			Employee e = session.createNamedQuery("getEmployeeById", Employee.class)
					.setParameter("id", 6)
					.getSingleResult();
			
			System.out.println("Employee: " + e.firstName + " " + e.lastName);
			
		} catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}
}
