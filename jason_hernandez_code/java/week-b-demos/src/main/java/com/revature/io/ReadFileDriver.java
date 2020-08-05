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

        // Use relative path, from week-b-demos
        File happy_text = new File("src/main/resources/happy_text.txt");

        if(!happy_text.exists()) {
            return;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(happy_text));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file.");
        }

        System.out.println("+--------------------------+");

        File users = new File("src/main/resources/users.txt");

    List<User> usersList = new ArrayList<>();

    try {
        BufferedReader reader = new BufferedReader(new FileReader(users));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            String[] userFields = currentLine.split(":");
            User user = new User();
            user.setId(Integer.parseInt(userFields[0]));
            user.setUsername(userFields[1]);
            user.setPassword(userFields[2]);

            usersList.add(user);
            currentLine = reader.readLine();

        }
        reader.close();

    } catch (
    IOException ioe) {
        ioe.printStackTrace();
        System.out.println("An exception occurred while reading the file.");
    }
    // Iterate across list
    for(User u : usersList) {
        System.out.println(u);
    }
}}
