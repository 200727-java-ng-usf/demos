package com.revature;

import com.revature.passbyvalue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

import java.awt.peer.SystemTrayPeer;

public class AppDriver {
    public static void main(String[] args){

        AppUser user = new AppUser("cdixon", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

        Person originalPerson = new Person ("Wez", "Singleton");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);

        System.out.println("+----------+");

        //pass-by-value with primitives
        int original = 10;
        int result = addTwo(original);
        System.out.println(original);
        System.out.println(result);


        //object references declared as final cannot be reassigned thought the object the point to can still be mutated
        final Person p1 =new Person("Bob", "Bailey");
        System.out.println(p1);
    }

    private static int addTwo(int value) {
        return value +2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }
}
