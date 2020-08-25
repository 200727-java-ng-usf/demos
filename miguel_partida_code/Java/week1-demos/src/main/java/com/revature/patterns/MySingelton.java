package com.revature.patterns;

public class MySingelton {

    //A static member of type MySingleton holds the one and only instance of this type
//    private static MySingelton onlyInstance ;//Lazy singleton (not pre-instantiated

    private static MySingelton onlyInstance = new MySingelton();// Eager Singelton; inherently thread safe



    //private constructor,
    private MySingelton(){

        }

        public static MySingelton getInstance(){

        //no need for a null check on an eager singleton
        return (onlyInstance == null) ? onlyInstance = new MySingelton() : onlyInstance;
        //the top and bottom do the same thing
//        if(onlyInstance == null){
//            onlyInstance = new MySingelton();
//            return onlyInstance;
//        }else {
//            return onlyInstance;
//        }
        }
   // Override the Object.clone() method; because it wouldn't be a singleton if you could clone it
        @Override
    protected Object clone() throws  CloneNotSupportedException{
        throw new CloneNotSupportedException();
        }
    }

