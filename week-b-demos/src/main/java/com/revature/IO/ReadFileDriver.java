package com.revature.IO;

import com.revature.IO.models.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileDriver {
    public static void main(String[] args) {

        // create a File object and use the relative path pf the text file
        // path start with src
        File happyText = new File("src/main/resources/happy-text.txt");

        // check if file exists
        if(!happyText.exists()){
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(happyText));
            String currentLine = reader.readLine();

            while(currentLine!=null){
                System.out.println(currentLine); // print current line
                currentLine = reader.readLine(); // storing
            }


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("An exception occurred while reading the file");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("something went wrong");

        }

        System.out.println("-----------------------------------------------------------");

        File user = new File("src/main/resources/user.txt");
        List<User> usersList = new ArrayList<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader(user));
            String currentLine = reader.readLine();

            while (currentLine != null){
                String[] userFields = currentLine.split(":");  // add word by word split by :
                User user1 = new User();


                user1.setId(Integer.parseInt(userFields[0]));
                user1.setPassword(userFields[2]);
                user1.setUserName(userFields[1]);

                //
                usersList.add(user1);

                System.out.println(currentLine);


                // move to next line
                currentLine = reader.readLine();

            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        for (User u:usersList){
            System.out.println(u);
        }
        System.out.println("-------------------------------------");
        usersList.forEach(user1 ->  System.out.println(user1));

        usersList.forEach(System.out::println);

    }
}
