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
        //File is an object ; creat a file object and use the relative path
        //of the text file; realtive paths and absolute paths
        File happyText = new File("src/main/resources/happy-text.txt");

        if(!happyText.exists()){
            return;
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            while (currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        System.out.println("+---------------+");

        File users = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<User>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();

            while (currentLine != null){
                //read the line, split it into a String[] containg user field values
                String[] userFields = currentLine.split(":");

                //Create a user object and begin setting its field values using the String[]
                User user = new User();
                user.setId(Integer.parseInt(userFields[0]));
                user.setUsername(userFields[1]);
                user.setPassword(userFields[2]);

                //add the created user to our list of users
                usersList.add(user);

                //tell our reader to move to the next line
                currentLine = reader.readLine();



//                System.out.println(currentLine);
//                currentLine = reader.readLine();

            }
            //always remember to close the file
            reader.close();

        }

        catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        //iterate across our list of users and print each one out to the console
        //for-each loop
        for(User u: usersList){
            System.out.println(u);
        }

        System.out.println("+---------------+");

        //traditional loop(enhanced loop) java 5 +
        for(int i =0; i < usersList.size(); i++){
            System.out.println(usersList.get(i));
        }
        System.out.println("+---------------+");
        //Lambda Expression (java
        usersList.forEach(user -> System.out.println(user));

        System.out.println("+---------------+");
        //method reference Expression
        usersList.forEach(System.out::println);

    }

}
