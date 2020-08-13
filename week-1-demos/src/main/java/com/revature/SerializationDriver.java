package com.revature;

import com.revature.models.AppUser;

import java.io.*;

public class SerializationDriver {

    public static void main(String[] args) {

//        AppUser newUser = new AppUser("bill","password");
//        serialUser(newUser);

        File bill = new File("src/main/resources/bill.ser");
        AppUser user = deSerializeUser(bill);
        System.out.println(user);

    }

    /*
            Serialization
            A mechanism of converting the state of a Java object into a byte stream
            the opposite is de serialization

            Serialized objects can be transmitted across a network or persisted to
            file, so that they can be loaded later - even after the appplication restarted


     */

    public static void serialUser (AppUser user){
        String filename = "src/main/resources/"+ user.getUsername() + ".ser"; //file extension not required
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            /*

             */
            oos.writeObject(user);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppUser deSerializeUser(File serializedUserFile){
        AppUser deSerializedUser = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile)) ) {

           deSerializedUser = (AppUser)ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deSerializedUser;
    }
}
