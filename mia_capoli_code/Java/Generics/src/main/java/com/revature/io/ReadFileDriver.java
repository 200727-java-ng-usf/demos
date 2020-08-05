package com.revature.io;

import com.revature.io.models.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileDriver {

    public static void main(String[] args) {
        //create a file object and use the relative path of the text file
        File happyText = new File("src/main/resources/happy-text.txt");
        //if currentLine = null, we reached the end of the file
        if (!happyText.exists()) {
            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

            // "\n" an escape literal
            // \t \r , ect

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occured while reading this file.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        System.out.println("~-----------------------------~");

        File users = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                //read the line, split into a String[] containing user field values
                String[] userFields = currentLine.split(":");

                //Create a user object and begin setting its field values using the String[]
                User user = new User();
                user.setId(Integer.parseInt(userFields[0]));
                user.setUsername(userFields[1]);
                user.setPassword(userFields[2]);

                //add to list of users
                usersList.add(user);

                //goto next line
                currentLine = reader.readLine();

            }
            reader.close(); //good practice to release connection to the file

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading this file.");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        // iterate across our list of users and print each one out to console
        for(User user : usersList) {
            System.out.println(user);
        }
        System.out.println("~----------------------~");

        usersList.forEach(user -> System.out.println(user)); //lambda expression syntax

        System.out.println("~----------------------~");

        usersList.forEach(System.out::println); //method reference syntax
    }

}
