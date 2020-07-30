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

        // Messing around with "final"
        System.out.println("+-----------------------------+");

        // object references declared as final cannot be reassigned, though the
        // object they point to can still be mutated
        final Person p1 = new Person("Bob", "Bailey");
        p1.setFirstName("Bill");
        System.out.println(p1);

//        p1 = new Person("Won't", "Work"); // p1 cannot be reassigned

        Object o = new Person("Howard", "Hughes"); // covariance (a type of inclusion polymorphism)
//        Person p2 = new Object(); // contravariance XXX

        int i = 10;
        long l = i;
        System.out.println(l);

        long l2 = 3_000_000_000_000L;
        int i2 = (int) l2;
        System.out.println(i2); // int size is too small to contain the value of l2
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
