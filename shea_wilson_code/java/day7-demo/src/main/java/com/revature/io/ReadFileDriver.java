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

        // create a file object use the relative path to the file
        File happyText = new File ("src/main/resources/HappyText.txt");

        if (!happyText.exists()){
            return;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            while(currentLine != null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        } catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        }catch (Exception e) {
            System.out.println("");
        }

        System.out.println("+-------------------------------------------+");

        File users = new File("src/main/resources/users.txt");
        List<User> userList = new ArrayList<User>();

        if (!users.exists()){
            return;
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();

            while(currentLine != null){

                String[] userFields = currentLine.split(":");
                User use = new User();
                use.setId(Integer.parseInt(userFields[0]));
                use.setUser(userFields[1]);
                use.setPassword(userFields[2]);

                userList.add(use);
                currentLine = reader.readLine();
            }

            reader.close();

        } catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        }catch (Exception e) {
            System.out.println("stahp");
        }

        for (User u : userList) {
            System.out.println(u);
        }

        for (int i = 0 ; i < userList.size() ; i ++){
            System.out.println(i);
        }

        System.out.println("+-----------------------------------------------+");

        userList.forEach(user -> System.out.println(user));

        System.out.println("+-------------------------------------------------+");

//        userList.forEach();

    }
}
