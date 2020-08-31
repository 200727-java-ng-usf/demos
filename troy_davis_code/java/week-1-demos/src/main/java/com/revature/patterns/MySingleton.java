package com.revature.patterns;


public class MySingleton {

    //A static member of type MySingleton
    private static MySingleton onlyInstance; //lazy singleton not pre instantiated

    //private static MySingleton onlyInstance = new MySingleton(); //Eager singleton, pre instantiated

    //private cons. so other classes cannot instantiate it
    private MySingleton(){
        super();
        System.out.println("[LOG] - LazySingleton.new invked");
    }

    public  static MySingleton getOnlyInstance(){
//        if(onlyInstance == null){
//            onlyInstance = new MySingleton();
//        }
//        return onlyInstance;

        //LAZY-Singleton one liner
        return (onlyInstance == null ? onlyInstance = new MySingleton() : onlyInstance);

       // return onlyInstance; // no need to do a null check, its the only one!
    }

    //override the clone method to prevent another instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
