package com.revature.exceptions;

import java.io.IOException;

public class ExceptionDriver {

    //can catch exceptions
    //can catch errors, but can't do shit about it


    //checked exception: compiler checks it
    //runtime exception: (unchecked exception) happens when running
    public static void main(String[] args){

        LoginScreen login = new LoginScreen();
        try {
            login.printMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        try{
            System.out.println("This is a try block.");

        }catch(Exception E){
            System.out.println(E);
        }

        finally{
            //will almost always execute regardless try catch resolution
        }

        //can use
        //try: multiple catches
        //try: finally
        //can not use
        //solitary try

        */
    }


}
