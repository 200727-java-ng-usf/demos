package com.revature.io;

import com.revature.io.models.User;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileDriver {
    public static void main(String[] args) {


        //create a File object, and use the relative path of the text file
        File happyText = new File("src/main/resources/happytext.txt");

        if(!happyText.exists()) {
            return;
        }

        try {

            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            while (currentLine != null) {
                System.out.println(currentLine);//print out currentline
                currentLine = reader.readLine();// move to next line in file
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("something went wrong.");
        }

        System.out.println("-----------");
        File users = new File("src/main/resources/user.txt");
        List<User> usersList = new ArrayList<>();

        try {

           BufferedReader reader = new BufferedReader(new FileReader(users));
           String currentLine = reader.readLine();

           while (currentLine != null) {

               String[] userFields = currentLine.split(":");

               // Create a user object and begin setting
               User user = new User();
               user.setId(Integer.parseInt(userFields[0]));
               user.setUsername(userFields[1]);
               user.setPassword(userFields[2]);

               usersList.add(user);

               currentLine= reader.readLine();


           }

           reader.close();// good practice to release connection to the file

        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("something went wrong.");
        }

        // traditional for loop (any version of Java)
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i));
        }

        System.out.println("+-------------------------+");

        // for-each loop (aka enhanced for loop) (Java 5+)
        for (User u : usersList) {
            System.out.println(u);
        }

        System.out.println("+-------------------------+");

        usersList.forEach(user -> System.out.println(user)); // lambda expression syntax (Java 8+)

        System.out.println("+-------------------------+");

        usersList.forEach(System.out::println); // method reference syntax (Java 8+)

    }

}