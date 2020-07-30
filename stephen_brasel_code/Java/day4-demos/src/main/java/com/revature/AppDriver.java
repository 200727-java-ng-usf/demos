package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    //You can make a String vararg for the main method.
//    public static void main(String... args) {
    public static void main(String[] args) {

        AppUser user = new AppUser("SBrasel", "drowssap", new Role[]{Role.TRAINER});
//        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        user.addRoles(); // variable arguments allow us to apss in a varying number of arguments to the addRoles method.
        System.out.println(user);

        System.out.println("+---------------------");
        int original = 10;
        int result = addTwo(original);
        System.out.println(original);   // 10
        System.out.println(result);     // 12
        System.out.println("+---------------------");

        // Pass-by-value with object references
        Person originalPerson = new Person("StephenJ", "Brasel");
        setFirstNameToBacon(originalPerson);
        System.out.println(originalPerson); // firstname is now Bob

        Person anotherPerson = new Person("Jim", "Jones");
        System.out.println(anotherPerson);
        Person reassignedPerson = reassignPerson(anotherPerson);
        System.out.println(anotherPerson == reassignedPerson);
        System.out.println(anotherPerson);
        System.out.println(reassignedPerson);
        System.out.println(anotherPerson.equals(reassignedPerson));

        // Messing around with final
        System.out.println("+========================================+");

        // Final variables can be changed, but the reference cannot be reassigned.
        // object references declared as final cannot  be reassigned, though the object
        // they point to can still be mutated
        final Person p1 = new Person("Bob", "Bailey");
        p1.setFirstName("Bill");
        System.out.println(p1);

//        p1 = new Person("Don't", "Work");


    }

    public static int addTwo(int value){
        return value + 2;
    }

    public static void setFirstNameToBacon(Person user){
        user.setFirstName("Bacon");
    }

    public static Person reassignPerson(Person person){
//        person.setLastName("TimOthy");
        person = new Person("Alice", "Anderson");
//        person.setLastName("2");

        return person;
    }

}
