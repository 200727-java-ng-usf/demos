package com.revature.models;

import java.io.*;

public class SerializationDriver {

    public static void main(String[] args) {
        //For serializing
        AppUser newUser = new AppUser("Bill", "p4assw0rd");
        serializeUser(newUser);

        //For deserializing
//        File adminFile = new File("src/main/resources/admin.ser");
//        AppUser user = deserializeUser(adminFile);
    }
    public static void serializeUser(AppUser user) {
        String fileName = "src/main/resources/" + user.getUsername() + ".ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static AppUser deserializeUser(File serializedUserFile) {

            AppUser deserializeUser = null;

            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))) {

                deserializeUser = (AppUser)ois.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return deserializeUser;
        }

}
