package com.revature.io;

import com.revature.io.models.User;
import com.sun.xml.internal.txw2.output.DumpSerializer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileDriver {

    public static void main(String[] args) {

        File happyTest = new File("src/main/resources/happy-text.txt");
        if (!happyTest.exists()) {
            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(happyTest));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();

            }


        } catch(IOException ioe){
           ioe.printStackTrace();
            System.out.println("An exception occured while reading the file");
        }  catch (Exception e) {
            System.out.println("Something went wrong...");

        }

        System.out.println("+--------------------------------+");

        File users = new File ("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        if (!users.exists()) {
            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[]userFields = currentLine.split(":");
                User user = new User();
                user.setId(Integer.parseInt(userFields[0]));
                user.setUsername(userFields[1]);
                user.setPassword(userFields[2]);

                usersList.add(user);

                //next line
                currentLine = reader.readLine();

            }

            reader.close();


        } catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occured while reading the file");
        }  catch (Exception e) {
            System.out.println("Something went wrong...");

        }

        for(User u : usersList) {
            System.out.println(u);
        } //enhanced for loop Java 5+

        //could also do so with usersList.size and .get (traditional for loop)
        //usersList.forEach(user -> System.out.println(user));  lambda expression syntax Java 8+
        //usersList.forEach(System.out::println);               method reference syntax  Java 8+


    }
}
