package com.revature.gernerics.io;

import com.revature.gernerics.io.models.User;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileDriver {
    public static void main(String[] args) {

        File happyText = new File("src/main/resources/happy-text.txt");

        if (!happyText.exists()) {
            return;
        }
        try {

            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentline = reader.readLine();

            while (currentline != null) {
                System.out.println(currentline);
                currentline = reader.readLine();
            }


        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("an exception occcured while reading the files");

        } catch (Exception E) {
            System.out.println("something went wrong");
        }
        System.out.println("-----------------");

        File users = new File("src/main/resources/users.txt");
        List<User> usersList = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(users));

            String currentLine = reader.readLine();

            while (currentLine != null){
                String[] userFields = currentLine.split(":");
                User use = new User();
                use.setId(Integer.parseInt(userFields[0]));
                use.setUsername(userFields[1]);
                use.setPassword(userFields[2]);

                usersList.add(use);

                currentLine = reader.readLine();


            } reader.close();



        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("an exception occcured while reading the files");

        } catch (Exception E) {
            System.out.println("something went wrong");
        }

        for(User u: usersList){
            System.out.println(u);
        }

        System.out.println("--------------");

        usersList.forEach(System.out::println);


    }
}
