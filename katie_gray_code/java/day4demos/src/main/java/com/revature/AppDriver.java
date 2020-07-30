package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    public static void main(String[] args) {

        AppUser user = new AppUser(8,"kgray", "pass", new Role[] {Role.DEV});
        user.addRoles(Role.TRAINER);
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);

        System.out.println(user.toString());
        System.out.println("+-----------------------+");

        int original = 10;
        int result = addTwo(original);
        System.out.println(original);
        System.out.println(result);

        Person originalPerson = new Person("katie", "gray");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);

        Person anotherPerson = new Person("Steph", "Hodel");
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);


        //messing with "final"
        System.out.println("+---------------------------");

        //object references declared as final cannot be reassigned , though
        // the object they point to can still be mutated
        final Person p1 = new Person("Bob", "Builder");
        p1.setFirstName("Bill");
        System.out.println(p1);
    }
    //pass by value with primitives

    public static int addTwo(int value){
        return value + 2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person){
        person = new Person("Berit", "Brown");
        return person;
    }

}
