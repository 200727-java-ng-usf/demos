package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    // You can legally use variable arguments with the main method signature:
    //      public static void main(String... args)
    // but it is not common/conventional
    public static void main(String[] args) {

        AppUser user = new AppUser("msue", "passme", new Role[] { Role.TRAINER });
        // variable arguments allows us to pass in a varying number of arguments to the addRoles method
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

        System.out.println("+-----------------------------+");

        // Pass-by-value with primitives
        int original = 10;
        int result = addTwo(original);
        System.out.println(original); // 10
        System.out.println(result); // 12

        System.out.println("+-----------------------------+");

        // Pass-by-value with object references
        Person originalPerson = new Person("Mary", "Sue");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);

        System.out.println("+-----------------------------+");

        Person anotherPerson = new Person("Jim", "Jones");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);
    }

    public static int addTwo(int value) {
        return value + 2;
    }

    public static void setFirstNameToBob(Person person) {
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person) {
        person = new Person("Alice", "Anderson");
        return person;
    }
}
