package com.revature.serials;

import java.io.*;

public class SerialDriver {

    public static void main(String[] args) {

        UserSerial newUser = new UserSerial("uname", "pword");
        serializedUser(newUser);

        File uname = new File("src/main/resources/uname.ser");
        UserSerial user = deserializedUser(uname);
        System.out.println(user);

    }


    //Serialization:
        //What: Converting the state of a Java object
            //Opposite of de-serialization
        //Why: Serialized objects can be sent across a network or persisted in a file
            //so that they can be loaded later, even after restart
        //How:
            //Classes used:
                //FileOutputStream and ObjectOutputStream (serialization)
                //FileInputStream and ObjectInputStream (deserialization)
                    //both autoclosable
    public static void serializedUser(UserSerial user){

        //extension is not require, but good practice.
        //only programming DEGENERATES don't use extensions
        String fileName = "src/main/resources/" + user.getUsername() + ".ser";

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            //write provided object to objectoutputstream. the class of the object.
            //the signature of the class. the its non-transient members.
            //all to file

            oos.writeObject(user);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static UserSerial deserializedUser(File serializedUserFile){
        UserSerial deserializedUser = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))){
            deserializedUser = (UserSerial)ois.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }

        return deserializedUser;
    }


}
