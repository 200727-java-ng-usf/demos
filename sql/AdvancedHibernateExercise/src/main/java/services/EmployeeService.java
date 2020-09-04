package services;

import Models.Employee;
import Models.Project1User;
import Models.Team;
import Models.TeamMembers;
import Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EmployeeService {

    public List<Employee> getEmployees() {

        Session session =
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();

            tx.commit();
            return employees;
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public double getAverageSalary() {

        Session session =
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();

            double sum = 0.0;
            for(Employee e : employees) {
                sum += e.getSalary();
            }

            tx.commit();
            return sum / employees.size();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return 0.0;
    }

    public List<Double> getAverageTeamSalary() {

        List<Double> salaries = new ArrayList<>();

        Session session =
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            List<Team> teams = session.createQuery("FROM Team", Team.class).list();


            double sum;
            for(Team t : teams) {
                sum = 0.0;
                Set<Employee> employees = t.getEmployees();
                for(Employee e : employees){
                    sum += e.getSalary();
                }
                salaries.add(sum / employees.size());
            }

            tx.commit();
            return salaries;
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }



}
