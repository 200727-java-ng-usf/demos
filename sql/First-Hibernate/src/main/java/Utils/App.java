package Utils;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Models.*;

public class App {
	public static void main(String[] args) {
		Session session = 
				//HibernateUtils.getSessionFactoryFileConfig().openSession();
				HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
		
		Transaction tx = null;

		try {
		   /*tx = session.beginTransaction();
		   
		   List<User> users = session.createQuery("FROM User", User.class).list();
		   for (User u : users) {
			   System.out.println("Entry: " + u.getFirstName() + " " + 
					   u.getLastName() + ", " + u.getEmailAddress());
		   }
		   
		   tx.commit();*/
			tx = session.beginTransaction();

			List<Project1User> users = session.createQuery("FROM Project1User", Project1User.class).list();
			for (Project1User u : users) {
				System.out.println(u);
			}

			tx.commit();
		}

		catch (Exception e) {
		   if (tx!=null) tx.rollback();
		   e.printStackTrace(); 
		} finally {
		   session.close();
		}
	}
}
