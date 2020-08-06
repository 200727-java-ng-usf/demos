package com.revature.io;

import com.revature.io.models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReadFileDriver {
    public static void main(String[] args) {

        // create a File object, and user the relative path fo the text file
        File happytext = new File("src/main/resources/happy-text.txt");
        if (!happytext.exists()) {
            System.out.println("File does not exist");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(happytext));
            String currentLine = reader.readLine();

            while(currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        System.out.println("+--------------------------------------------+");

        File usersFile = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(usersFile));
            String currentLine = reader.readLine();
            while(currentLine != null) {

                //read the line, split it into String[] containing user field values
                String[] userFields = currentLine.split(":");

                //create a user object and begin setting its field values using the String[]
                User user = new User(Integer.parseInt(userFields[0]), userFields[1], userFields[2]);

                // add teh created user to our list of users
                usersList.add(user);

                //tell the reader to read the next line
                currentLine = reader.readLine();

            }

            reader.close(); // good practice

        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        // iterate across our list of users and print each one out to the console

        // traditional for loop
        for(int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i));
        }

        System.out.println("+---------------------------------------+");

        //for-each loop (aka enhanced for loop)
        for(User u : usersList) {
            System.out.println(u);
        }



        System.out.println("+-----------------------------------+");



        //lambda expression
        // can only be used with functional interfaces (one and only one abstract method; static/defaults don't count)
        // a lambda expression is the inline implementation of a functional interface's one abstract method (ex. line 98 to line 102)
        usersList.forEach(user -> System.out.println(user)); // lambda expression syntax

        //before Java 8 and the intro of lambda expressions; this is what we had to do before
        //this example leverages a local anonymous class
        //equivalent to lambda expression
        usersList.forEach(new Consumer<User>() {
           @Override public void accept(User user) {
               System.out.println(user);
           }
        });

        System.out.println("+Using method reference sytnax-----------------------------------+");
        //method reference syntax
        // same restrictions as the lambda expression
        usersList.forEach(System.out::println); // method reference syntax

        System.out.println("+Using Iterator-----------------------------------+");

        Iterator<User> userIterator = usersList.iterator();

        while(userIterator.hasNext()) {
            System.out.println(userIterator.next());
        }
    }
}
