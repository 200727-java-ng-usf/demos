package com.revature;

import com.revature.models.AppUser;

import java.io.*;

public class SerializationDriver {

	public static void main(String[] args) {
//		AppUser newUser = new AppUser("alice", "hidden");
//		serializeUser(newUser);

		//deserializing users
//		File adminFile = new File("src/main/resources/admin.ser");
//		AppUser user = deserializeUser(adminFile);
//		System.out.println(user);

		File aliceFile = new File("src/main/resources/alice.ser");
		AppUser alice = deserializeUser(aliceFile);
		System.out.println(alice);

	}

	/*
	 	Serialization

	 		A mechanism of converting the state of a Java object into a byte stream.

	 		Why:
	 			Serializaed objects can be transmitted across a network or persisted
	 			to a file, so that they can be loaded later, even after the application
	 			has restarted.

	 		How:
	 			Classes used:
	 				- FileOutputStream and ObjectOutputStream (serialization)
	 				- FileInputStream and ObjectInputStream (deserialization)
	 			Methods used:
	 			- To serialize, use: ObjectOutputStream.writeObject(Object o)
	 			- To de-serialize, use: ObjectInputStream.readObject()
	 */
	public static void serializeUser(AppUser user){

		//file extension is not required
		String filename = "src/main/resources/" + user.getUsername() + ".ser";

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
		    /*
		    	Wrtite the provided object to the ObjectOutputStream. The class of the
		    	object, the signature of the class, and its non-transient and non-static
		    	members will be written to the file.
		     */
			oos.writeObject(user);

		} catch(FileNotFoundException fnne) {
		    fnne.printStackTrace();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}

	}

	public static AppUser deserializeUser(File serializedUserFile){

		AppUser deserializedUser = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedUserFile))){

			deserializedUser = (AppUser) ois.readObject();

		} catch(FileNotFoundException fnne) {
			fnne.printStackTrace();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException cnne) {
			cnne.printStackTrace();
		}
		return deserializedUser;
	}

}
