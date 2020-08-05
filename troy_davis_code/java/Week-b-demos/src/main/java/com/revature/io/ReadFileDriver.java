package com.revature.io;

import com.revature.io.models.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReadFileDriver {
    public static void main(String[] args) {
        //using buffered reader

        //create a file object and use the relative path to the text file
        //relative root folder is week-b-demos
        File happyText = new File("src/main/resources/happytext.txt");

        if(!happyText.exists()){
            return;
        }

        try {
            //use buffered reader
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();//set current line to new String

            while (currentLine != null){//while the line is not null (end of file)
                System.out.println(currentLine);//print current line
                currentLine = reader.readLine();//get next line

            }
            reader.close();
            // "\n" <- new line literal
        } catch (IOException ioe){
            //I.R.L. WILL NEED MULTIPLE EXEPTIONS IN DIFFERENT CATCH BLOCKS
            ioe.printStackTrace();
            System.out.println("an exception occured while reading this file. ");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong... ");
        }

        System.out.println("++----------------------++");

        File users = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();

            while (currentLine != null){
                String[] userFields = currentLine.split(":"); // split into new string aqrray

                User user = new User(); // create new user

                user.setId(Integer.parseInt(userFields[0])); //throws number fields exception
                user.setUsername(userFields[1]);//set the correct fields
                user.setPassword(userFields[2]);

                usersList.add(user); //add new user to list //can cause memory error

                currentLine = reader.readLine(); //Get next line OR ELSE INFINITE LOOP!!


            }
            reader.close(); //good practice to release connection to the file
        } catch (IOException ioe){
            //I.R.L. WILL NEED MULTIPLE EXEPTIONS IN DIFFERENT CATCH BLOCKS
            ioe.printStackTrace();
            System.out.println("an exception occured while reading this file. ");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong... ");
        }
        //java5
        for(User u : usersList){
            System.out.println(u);
        }
        System.out.println("++-----------------------++");
        //foreve
        for(int i =0; i <usersList.size(); i++){
            System.out.println(usersList.get(i));
        }
        System.out.println("++-----------------------++");

        //can only be used in functional interfaces (one and only one abstract method; static /defaults dont count)


        //A lambda expression is the inline implementation of a functional interfaces one abstract method

        usersList.forEach(user -> System.out.println(user)); //method reference syntax // java 8+
        System.out.println("++-----------------------++");

        usersList.forEach(System.out::println); //method reference syntax // java8+

        //same thing as an old lambda expression
        //"local anonymous class"
        usersList.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        });


    }
}
