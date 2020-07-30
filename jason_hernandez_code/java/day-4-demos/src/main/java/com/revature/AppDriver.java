package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    public static void main(String[] args) {
        AppUser user = new AppUser("jason", "password", new Role[] {Role.DEV});
        user.addRoles(); //Allows a varying number of roles to be added
        System.out.println(user);

        System.out.println("+---------------------------------+");

        final Person p1 = new Person("Bob", "Bailey"); // p1 can never again have an =
        p1.setFirstName("Bill"); // Change the value, but without using the =
        // A person's name can change, but is still the same person
        System.out.println(p1); // Prints Bill Bailey
    }

    public static int addTwo(int value) {
        return value + 2;
    }

    Person originalPerson = new Person("firstName", "Hernandez");

    public static void setFirstName(Person person) {
        person.setFirstName("Jason");
    }

}
