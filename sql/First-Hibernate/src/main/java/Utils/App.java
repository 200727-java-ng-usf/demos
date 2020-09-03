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
}
