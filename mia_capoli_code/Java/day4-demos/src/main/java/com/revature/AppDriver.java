package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

import java.sql.SQLOutput;

public class AppDriver {
    // you can legally use variable arguments with the main method signature, but that isn't super common
    public static void main(String[] args) {

        AppUser user = new AppUser("capolimia", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR, Role.ADMIN); // variable args allows us to pass in a varying number of args to the addRoles method
        System.out.println(user);

        System.out.println("+____________________");

        int original = 10;
        int result = addTwo(original);
        System.out.println(original); // 10
        System.out.println(result); // 12
        Person originalPerson = new Person("Mia", "Capoli");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);

        Person anotherPerson = new Person("Jim", "Jones");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);
    }

    public static int addTwo(int value) {
        return value + 2; // java is making a copy and not manipulating the og
    }

    public static void setFirstNameToBob(Person person) {
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person) {
        person = new Person("Alice", "Anderson");
        return person;
    }

}

