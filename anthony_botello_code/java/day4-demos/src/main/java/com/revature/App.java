package com.revature;

import com.revature.varargs.*;
import com.revature.passbyvalue.Person;

public class App {

    public static int addTwo(int value){
        return value + 2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person){
        person = new Person("Alice", "Anderson");
        return person;
    }

    public static void main( String[] args )
    {
        AppUser user = new AppUser("abotello", "password", new Role[] {Role.DEV});
        user.addRoles(); // varargs allows us to pass in a variable number of arguments to method
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);
        System.out.println(user);

        System.out.println("+-----------------------------------------------------+");

        // Pass-by-value with primitives
        int original = 10;
        int result = addTwo(original);
        System.out.println(10); // 10
        System.out.println(result); // 12

        // Pass-by-value with object references
        Person originalPerson = new Person("Anthony", "Botello");

        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);

        Person anotherPerson = new Person("Jim", "Jones");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(reassignedPerson == anotherPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);

        // Messing around with "final"
        System.out.println("+-----------------------------------------------------+");

        // final variables cannot be reassigned (i.e., must keep same object reference)
        // object can still be mutated
        final Person p1 = new Person("Bob", "Bailey");  
        p1.setFirstName("Bill");
        System.out.println(p1);

        // p1 = new Person("Doesn't", "Work"); // won't work



    }
}
