package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    // You can legally use variable arguments with the main
    public static void main(String[] args){

        AppUser user = new AppUser("stalesky" , "password", new Role[] {Role.TRAINER});

        user.addRoles(Role.DEV, Role.BLDG_MNGR, Role.ADMIN);
        user.addRoles(); // variable arguments allows us to pass in
        System.out.println(user);

        System.out.println("+---------------------+");

        // Pass by-value with primitives
        int original = 10;
        int result = addTwo(original);
        System.out.println(original);
        System.out.println(result);

        // Pass by value with objects references
        Person originalPerson = new Person("Curtis", "Stalesky");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson); // firstname is now "Bob"
        Person anotherPerson = new Person("Jim", "Jones");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);


        // --------------------------------------------------

        //Messing around with "final"
        System.out.println("+---------------------------------------+");

        final Person p1 = new Person("Bob", "Bailey");
        p1.setFirstName("Bill");
        System.out.println(p1);
        // final only affects the reference but it does not affect the actual value of the object.

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
