package com.revature;

import java.util.List;

import com.revature.models.*;
import com.revature.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppDriver {
    public static void main(String[] args) {
        Session session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
        HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();

        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Employees");
            List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();
            for (Employee e : employees) {
                System.out.println("Entry: " + e.getId() + ", " +
                       e.getFirstName()  + " " + e.getLastName() + ", " +
                        e.getSalary());
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Locations");
            List<Location> locations = session.createQuery("FROM Location", Location.class).list();
            for (Location l : locations) {
                System.out.println("Entry: " + l.getId() + ", " +
                        l.getEmployee().getId() + ", " + l.getStreet() + " " +
                        l.getCity() + " " + l.getState() + " " + l.getZip());
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Projects");
            List<Project> projects = session.createQuery("FROM Project", Project.class).list();
            for (Project p : projects) {
                System.out.println("Entry: " + p.getId() + ", " +
                        p.getProjectName() + ", " + p.getProjectBudget());
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Project Teams");
            List<ProjectTeam> projectTeams = session.createQuery("FROM ProjectTeam", ProjectTeam.class).list();
            for (ProjectTeam pt : projectTeams) {
                System.out.println("Entry: " + pt.getProject().getId() + ", " +
                        pt.getTeam().getId());
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }


        session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Teams");
            List<Team> teams = session.createQuery("FROM Team", Team.class).list();
            for (Team t : teams) {
                System.out.println("Entry: " + t.getId() + ", " +
                        t.getLocation().getId() + ", " + t.getEmployee().getId());
                t.getEmployees().forEach((Employee e) -> {
                    System.out.println(e.getId());});
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
        session =
                //HibernateUtils.getSessionFactoryFileConfig().openSession();
                HibernateUtils.getSessionFactoryProgrammaticConfig().openSession();
        tx = null;

        try {
            tx = session.beginTransaction();
            System.out.println("Team Members");
            List<TeamMember> teamMembers = session.createQuery("FROM TeamMember", TeamMember.class).list();
            for (TeamMember tm : teamMembers) {
                System.out.println("Entry: "  + tm.getTeam().getId() +  ", " +
                        tm.getTeamMember().getId());
            }

            tx.commit();
        }

        catch (Exception e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}