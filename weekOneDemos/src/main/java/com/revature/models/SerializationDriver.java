package com.revature.models;

import java.io.*;

public class SerializationDriver {
    public static void main(String[] args) {

        File adminFile = new File("src/main/resources/yuan.ser");

       AppUser printUser = deserialization(adminFile);

        System.out.println(printUser.toString());


//        AppUser appUser = new AppUser("yuan","1234");
//
//        serializeUser(appUser);

    }

    /**
     * serialization :  what, converting the java object into a byte stream
     *                  why,  pack to a stream to transmitted across internet and unpack from
     *                  another end. (serialization and de-serialization)
     *
     *                   how, FileOutputStream and ObjectOutputStream (Serialization)
     *                        FileInputStream and ObjectOutputStream( deSerialization)
     * @param user
     */

    public static void serializeUser(AppUser user){

        String fileName = "src/main/resources/"+user.getUsername()+".ser"; //file extension is not required

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(user);

        } catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static AppUser deserialization(File serializedUserFile){

        AppUser deSerializedUser = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))) {
            deSerializedUser=(AppUser)ois.readObject();

        }catch (FileNotFoundException e){
            e.printStackTrace();}
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deSerializedUser;

    }

}
