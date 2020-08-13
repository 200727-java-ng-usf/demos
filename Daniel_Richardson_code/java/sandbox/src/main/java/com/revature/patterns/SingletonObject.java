package com.revature.patterns;


//part of the singleton design pattern
//fun fact: singleton was known as a warrior-poet of the far-east, famed for slaying the mythical oracle daemon
//  he is also the great ancestor and martial arts tutor of Wezley.
public class SingletonObject {

    //private static PatternObject onlyInstance = new PatternObject(); //eager singleton (pre-instantiated)
    //eager singleton is thread-safe
    private static SingletonObject onlyInstance; //lazy singleton (not premade)

    private SingletonObject(){ //constructor is private, so other methods can't lay their dirty java hands on it
        super();
        System.out.println("PatternObject instanced");
    }


    //must be static since method isn't used in created object
    public static SingletonObject getInstance(){
        if(onlyInstance == null){
            onlyInstance = new SingletonObject();
        }
        //this checks if instance was made, and if not, makes it

        return onlyInstance;
    }

    //overide clone so it can't be cloned. only COWARDS clone singleton patterned objects
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
