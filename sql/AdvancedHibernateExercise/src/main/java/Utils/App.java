package Utils;

import Models.Employee;
import Models.Project1User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import services.EmployeeService;

import java.util.List;

public class App {
	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();

		System.out.println("Average Salary: ");
		System.out.println(employeeService.getAverageSalary());

		System.out.println();
		System.out.println("Average Salaries: ");
		System.out.println(employeeService.getAverageTeamSalary());



//		Session session =
//				//HibernateUtils.getSessionFactoryFileConfig().openSession();
//				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
//
//		Transaction tx = null;
//
//		try {
//		   /*tx = session.beginTransaction();
//
//		   List<User> users = session.createQuery("FROM User", User.class).list();
//		   for (User u : users) {
//			   System.out.println("Entry: " + u.getFirstName() + " " +
//					   u.getLastName() + ", " + u.getEmailAddress());
//		   }
//
//		   tx.commit();*/
//			tx = session.beginTransaction();
//
//			List<Project1User> users = session.createQuery("FROM Project1User", Project1User.class).list();
//			for (Project1User u : users) {
//				System.out.println(u);
//			}
//
//			tx.commit();
//		}
//
//		catch (Exception e) {
//		   if (tx!=null) tx.rollback();
//		   e.printStackTrace();
//		} finally {
//		   session.close();
//		}
	}
}
