package com.revature;

import com.revature.models.AppUser;

import java.io.*;


public class SerializationDriver {
    public static void main(String[] args) {
        AppUser newUser = new AppUser("admin","password");
        serializeUser(newUser);
        File adminFile = new File("src/main/resources/admin.ser");
        AppUser user = deserializedUser(adminFile);
        System.out.println(user);
    }
    /**
     * Serialization
     *      - process of converting an object into a byte stream
     *      - mechanism of converting state of a java object into a byte stream
     *      why?
     *          - serialized objects can be transmitted across a network, or persisted to a file
     *              to be loaded later even after the app has restarted
     *      how?
     *          - classes used:
     *              - FileOutputStream and ObjectOutputStream(serialization)
     *              - FileInputStream and ObjectInputStream(deserialization)
     *      Methods used
     *          - to serialize use : ObjectOutputStream.writeObject(Object O)
     *          - to de-serialize, use: ObjectInputStream.readObject(Object o)
     */
    public static void serializeUser(AppUser user){

        String filename = "src/main/resources/" +user.getUsername() + ".ser"; //indicates serialized file, does not need to be .ser tho
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            /*
                Write the provided object to the ObjectOutputSrteam. the class of the object, the
                signiture of the class, and its non-transient and non static members will be written to the file
             */
            oos.writeObject(user);

        }catch (FileNotFoundException fe){
            fe.printStackTrace();
        }catch (IOException E){
            E.printStackTrace();
        }
    }
    public static AppUser deserializedUser(File serializedFile){

        AppUser deserializedUser = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedFile))){
           deserializedUser= (AppUser) ois.readObject();
        }catch (FileNotFoundException fe){

        } catch (ClassNotFoundException cnf){

        } catch (IOException ioe){

        }

        return deserializedUser;

    }

}
