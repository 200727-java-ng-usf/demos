package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    //for singleton instance
    private static ConnectionUtil cu = new ConnectionUtil();

    // add your jdbc url
    public static final String URL = "jdbc:postgresql://java-ng-usf-200727.casmekiat9nm.us-east-1.rds.amazonaws.com:5432/postgres";
    // add your jdbc username
    public static final String USERNAME = "rev_assess";
    // add your jdbc password
    public static final String PASSWORD = "revature";
    // name of the created stored procedure in tier 3
    public static final String TIER_3_PROCEDURE_NAME = "";
    // name of the created sequence in tier 3
    public static final String TIER_3_SEQUENCE_NAME = "";

    public static ConnectionUtil getInstance(){
        return cu;
    }

    // implement this method to connect to the db and return the connection object
    public Connection connect() {
        Connection conn = null;

        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://java-ng-usf-200727.casmekiat9nm.us-east-1.rds.amazonaws.com:5432/postgres",
                    "project_app",
                    "revature");

        } catch (SQLException sqle) {
            System.out.println("A problem with database connection has occurred");
            sqle.printStackTrace();
        }
        catch (ClassNotFoundException cnfe) {
	        	System.out.println("A problem with database connection has occurred");
	        }

         //if (conn == null) {
          //  throw new RuntimeException("Failed to establish connection.");
        // }
        return conn;
    }
}