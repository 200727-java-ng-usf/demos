package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    // You can legally use variable arguments with the main method signature, but that isn't super common
    public static void main(String... args) {

        AppUser user = new AppUser("srogers", "supersecretpassword", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

        System.out.println("+----------------------+");

        // Pass-by-value with primitives
        int original = 10;
        int result = addTwo(original);
        System.out.println(original); // 10
        System.out.println(result); // 12

        // Pass-by-value with object references
        Person originalPerson = new Person("Sean", "Rogers");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson); // firstname is now "Bob"

        Person anotherPerson = new Person("Jim", "Jones");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);
        System.out.println(anotherPerson.equals(reassignedPerson));

        //Messing around with "final"
        System.out.println("+-------------------------------------+");

        // object references declared as final cannot be reassigned, though the object
        // they point to can still be mutated
        final Person p1 = new Person("Bob", "Bailey");
        p1.setFirstName("Bill");
        System.out.println(p1);

        //p1 = new Person("Doesn't", "Work");

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
