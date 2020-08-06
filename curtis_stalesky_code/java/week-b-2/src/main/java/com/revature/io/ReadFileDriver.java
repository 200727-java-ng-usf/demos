package com.revature.io;

import com.revature.io.models.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReadFileDriver {

    public static void main(String[] args) {
        // create a File object and use the relative path of the text file
        // 2 paths types of paths, Absolute path and Relative path
        // Absolute path is From beginning of "~" or root director near C:\
        // Relative path is From the main source folder from the project.

        // Create a File object, and use the relative path of the text file
        File happyText = new File("src/main/resources/happytext.txt");

        if (!happyText.exists()) {
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            // While current line is not null, continue reading line
            // If currentLine == null then we have reached the end of the block
            while (currentLine != null) {
                System.out.println(currentLine); // Prints out currentLine
                currentLine = reader.readLine(); // move to next line
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading a file.");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        System.out.println("+______________________________________________+");

        File user = new File("src/main/resources/Users.txt");
        List<User> userList = new ArrayList<>(); // List that will store users
        try {

            BufferedReader reader = new BufferedReader(new FileReader(user));
            String currentLine = reader.readLine();

            // If currentLine == null, then we have reached the end of the file
            while (currentLine != null) {

                // read the line, split it into a String[] containing user field values
                String[] userFields = currentLine.split(":");

                // Creates user object and begin setting its field values using the String[]
                User use = new User();
                use.setId(Integer.parseInt(userFields[0]));
                use.setUsername(userFields[1]);
                use.setPassword(userFields[2]);

                // Add the created user to our list of users
                userList.add(use);

                // tell our reader to move to the next line
                currentLine = reader.readLine();

            }
            reader.close(); // Good practice to release connection to the file

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading a file.");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }

        // iterate across our list of users and print each one out to the console
        // This is an enhanceed for loop (foreach) (Java 5)
        for(User u : userList)
        {
            System.out.println(u);
        }
        System.out.println("+-------------------------------------------+");

        // Another way to print out users (Any version of Java)
        for (int i = 0; i < userList.size(); i++){
            System.out.println(userList.get(i));
        }

        System.out.println("+-------------------------------------------+");

        // can only be used with functional interfaces (one and only one abstract method;
        // static/defaults don't count)

        // A lambda expression is the inline implementation of a functional interface's one abstract method
        userList.forEach(use -> System.out.println(use)); // Lambda expression syntax (Java 8+)
        System.out.println("+-------------------------------------------+");

        // before Java 8  and the intro of lambda expressions; this is what we had to do before
        // this example leverages a "local anonymous class"
        // QC won't ask this; ins an OCP Oracle Certified Professional topic (OPTIONAL)
        userList.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {

            }
        });

        System.out.println("+-------------------------------------------+");

        // Same restrictions as the lambda expression
        userList.forEach(System.out::println); // method reference syntax (Java 8+)

        Iterator<User> userIterator = userList.iterator();
    }
}



