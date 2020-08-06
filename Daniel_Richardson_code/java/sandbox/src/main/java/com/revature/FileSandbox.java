package com.revature;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileSandbox {

    public static void fileDriver() {
        File fileSandboxText = new File("src/main/resources/FileSandboxText");
        //don't use absolute file paths (i.e. personal home dir)

        if(!fileSandboxText.exists()){
            return; //if it doesn't exist, back to main
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileSandboxText));
            String currentLine = reader.readLine();

            while(currentLine != null){ //checks for the end of the file
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }


        } catch (Exception E){
            //for larger projects, will need to spread out exception handling based on type
            //ex. (IOException ioe)
            System.out.println("FUCK");

        }
        System.out.println("----------");
        File users = new File("src/main/resources/FileSandboxText2");
        List<User> usersList = new ArrayList<>();

        //insert try block
        try {
            BufferedReader reader = new BufferedReader(new FileReader(users));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String[] userFields = currentLine.split(":");
                User user = new User();
                user.setId(Integer.parseInt(userFields[0]));
                user.setUserID(userFields[1]);
                user.setPassword(userFields[2]);
                usersList.add(user); //add user to list

                currentLine = reader.readLine(); //reader to next line

            }
            reader.close();

        } catch (Exception E){
            System.out.println("FUCKK");
        }
        //displays all the stuff
        for(User u : usersList){
            System.out.println(u);
        }


    }

}
