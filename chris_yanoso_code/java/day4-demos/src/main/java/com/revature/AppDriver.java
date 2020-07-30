package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    public static void main(String[] args) {

        AppUser user = new AppUser("CYanoso", "password", new Role[] {Role.ADMIN});
        user.addRoles(Role.DEV); //variable arguments allows us to pass in a varying number of arguments
        user.addRoles(); //can even pass in 0 vars
        System.out.println(user);

        System.out.println("+-----------------------------+");
        //Pass-by-value with primitives
        int original =10;
        int result = addTwo(original);
        System.out.println(original);
        System.out.println(result);

        System.out.println("+-----------------------------+");

        //Pass-by-value with object references
        Person originalPerson = new Person("Chris", "Yanoso");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);
    }

    public static int addTwo(int value) {
        return value +2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }

}
