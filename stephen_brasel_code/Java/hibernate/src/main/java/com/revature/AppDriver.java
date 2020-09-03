package com.revature;

import com.revature.model.AppUser;
import com.revature.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AppDriver {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getInstance().openSession();

		Transaction tx = null;

		try{
		    tx = session.beginTransaction();

			List<AppUser> users = session.createQuery("FROM com.revature.model.AppUser", AppUser.class).list();
			for (AppUser u : users) {
				System.out.println("Entry: "
						+ u.getFirstName() + " "
						+ u.getLastName() + " "
						+ u.getEmail());
			}

			tx.commit();

		} catch(Exception e) {
			if(tx != null) tx.rollback();
		    e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
