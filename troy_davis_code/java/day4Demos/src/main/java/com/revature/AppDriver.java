package com.revature;

import com.revature.passByValue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    //you can legally use var args with the main method signiture but this is not common
    public static void main(String... args) {

        AppUser user = new AppUser("troy", "pass", new Role[]{Role.TRAINER});
        user.addRolls(Role.DEV, Role.BLDG_MNGR);
        user.addRolls();// can pass in a varioable number of arguments
        System.out.println(user);

        //pass by value with primitives
        System.out.println("++-----------------------------++");
        int original = 10;
        int result = addTwo(original);
        System.out.println(original);
        System.out.println(result);


        Person op = new Person("Troy", "Davis");
        setFirstNameToBob(op);
        System.out.println(op);

        Person ap = new Person("jim", "jones");
        Person rp = reassignPerson(ap);
        System.out.println(ap==rp);
        System.out.println(ap);
        System.out.println(rp);
    }

    public static int addTwo(int value){
        return value +2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person){
        person = new Person("Troy", "Wrighten");
        return person;
    }
}
