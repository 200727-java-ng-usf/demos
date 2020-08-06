package com.revature.io;

import com.revature.io.models.User;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReadFileDriver {
    public static void main(String[] args) {

        // create a File obj and use hte relative path of the text File
        File happyText = new File("src/main/resources/happy-text.txt");
        if(!happyText.exists()){
            return;
        }

        try{

            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            // if currentLine == null, then we have reached the end of the file.
            while(currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();

        } catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        System.out.println("+------------------------+");
        File users = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        try{

            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();
            while(currentLine != null){

                // read the line, split it into a String[] containing user field values
                String[] userFileds = currentLine.split(":");

                // Create a user object and begin setting its field values using the String[]
                User user = new User();
                user.setId(Integer.parseInt(userFileds[0]));
                user.setUsername(userFileds[1]);
                user.setPassword(userFileds[2]);

                // add the created user  to our list of users
                usersList.add(user);

                // tell our reader to move to the next line
                currentLine = reader.readLine();
            }
            reader.close(); //good practice

        } catch(IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }

        // Iterate across out list of users and print each out to the console

        // traditional for loop (Any Java Version)
        for (int i = 0; i < usersList.size(); i++) {
            System.out.println(usersList.get(i));
        }

        System.out.println("+-----------------------+");

        // for-each loop (aka enhanced for loop) (Java 5+)
        for (User u : usersList) {
            System.out.println(u);
        }

        System.out.println("+-----------------------+");

        // can onlybe used with functional interfaces
        // (one and onle one abstr5act method; static/defaults don't count

        // :IMPORTANT: A lambda expression is the inline implementation of a functional interface's one abstract method
        usersList.forEach(user -> System.out.println(user)); // lambda expression syntax (Java 8+)

        // before Java 8,. and hte intro of lambda expressions, this is what we had to do before
        // this example leverages a "local anonymous class"
        // QC shouldn't ask for this, its an OCP topic (OPTIONAL TO KNOW, but GOOD TO KNOW)
        usersList.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        });

        System.out.println("+-----------------------+");

        usersList.forEach(System.out::println); // method reference syntax (Java 8+)

        System.out.println("+-----------------------+");

        Iterator<User> userIterator = usersList.iterator();

        System.out.println("Iterator");
        while (userIterator.hasNext()){
            System.out.println(userIterator.next());
        }
    }

}
