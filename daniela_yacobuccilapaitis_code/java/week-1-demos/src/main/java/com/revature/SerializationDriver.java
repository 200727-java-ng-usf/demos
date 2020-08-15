package com.revature;

import com.revature.models.AppUser;

import java.io.*;

public class SerializationDriver {

    public static void main(String[] args) {

//        AppUser newUser = new AppUser("admin", "password");
//        serializeUser(newUser);

        File adminFile = new File("src/main/resources/admin.ser");
        AppUser user = deserializeUser(adminFile);
        System.out.println(user);



    }

    public static void serializeUser(AppUser user) {
        // file extension is not required
        String fileName = "src/main/resources/" + user.getUsername() + ".ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            /*
                Write the provided object to the ObjectOutputStream. The class of the object, the
                signature of the class, and its non-transient and non-static members will be written
                to the file.
             */
            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppUser deserializeUser (File serializedUserFile) {

        AppUser deserializedUser = null;

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile));
            ois.readObject();
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }


        return deserializedUser;
    }


}
