package com.revature.repo;

import com.revature.models.Employee;
import com.revature.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepository {

    public static void printEmployees(){

        Session session = HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        Transaction tx = null;

        try{
            tx = session.beginTransaction();
            List<Employee> employees = session.createQuery("FROM Employee ", Employee.class).list();

            for (Employee e : employees) {
                System.out.println("Entry: " + e.getId() + ", " + e.getFirstName()
                        + " " + e.getLastName() + ", " + e.getSalary());
            }

            tx.commit();
        } catch (Exception e) {
            if (tx!= null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
