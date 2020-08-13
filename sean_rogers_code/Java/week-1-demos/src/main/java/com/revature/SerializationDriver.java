package com.revature;

import com.revature.models.AppUser;

import java.io.*;

public class SerializationDriver {
    public static void main(String[] args) {
//        AppUser newUser = new AppUser("admin", "password");
//        serializeUser(newUser);

        File adminFile = new File("src/main/resources/admin.ser");
        System.out.println(deserializeUser((adminFile)).getUsername());
    }
    /*
        Serialization

            What:
                A mechanism of converting the state of a Java object into a byte stream.

            Why: Serialized objects can be transmitted across a network or persisted to a
                file, so that the can be loaded later - even after the application has
                restarted.

            How:
                Classes used:
                    - FileOutputStream and ObjectOutputStream (serialization) ObjectOutputStream.writeObject(Object o)
                    - FileInputStream and ObjectInputStream (de-serialization ObjectInputStream.readObject()
     */
    public static void serializeUser(AppUser user) {
        String fileName = "src/main/resources/" + user.getUsername() + ".ser"; // file extension is not required

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            /*
                Write the provided object to the file
             */
            oos.writeObject(user);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppUser deserializeUser(File serializedUserFile) {
        AppUser deserializedUser = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))) {
            deserializedUser = (AppUser) ois.readObject();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deserializedUser;
    }
}
