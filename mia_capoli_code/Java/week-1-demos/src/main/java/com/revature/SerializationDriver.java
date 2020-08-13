package com.revature;

import com.revature.models.AppUser;

import java.io.*;

public class SerializationDriver {
    public static void main(String[] args) {


//        AppUser newUser = new AppUser("alice", "nerd");
//        serializeUser(newUser);

        //deserializing users
//        File adminFile = new File("src/main/resources/admin.ser");
//        AppUser user = deserializeUser(adminFile);
//        System.out.println(user);
//
//        File aliceFile = new File("src/main/resources/alice.ser");
//        AppUser alice = deserializeUser(aliceFile);
//        System.out.println(alice);
    }

    /*
        Serialization

            what:
                A mechanism of converting the state of a java object int a byte stream.
                The opposite process is known as deserialization.
            Why:
                Serialized objects can be transmitted across a network or persisted to a file,
                so that they can be loaded later even after the application has restarted.
            How:
                Classes used:
                    -FileOutputStream and ObjectOutputStream (serialization)
                    -FileInputStream and ObjectInputStream (de-serialization)

                Methods used:
                    -To serialize, use: ObjectOutputStream.writeObject(Object o)
                    -To de-serialize, use: ObjectInputStream.readObject(Object o)

     */
    public static void serializeUser(AppUser user) {

        String filename = "src/main/resources/" + user.getUsername() + ".ser"; //file extension doesn't matter

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            /*
            write the provided object to the objectoutputstream. the class of the object, the signature of the class, and it's
            non-transient and non-static members will be written to the file.
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

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))) {
            deserializedUser = (AppUser) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deserializedUser;
    }
}
