package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    public static void main(String[] args) {
        AppUser user = new AppUser("jason", "password", new Role[] {Role.DEV});
        user.addRoles(); //Allows a varying number of roles to be added
        System.out.println(user);
    }

    public static int addTwo(int value) {
        return value + 2;
    }

    Person originalPerson = new Person("firstName", "Hernandez");

    public static void setFirstName(Person person) {
        person.setFirstName("Jason");
    }
}
