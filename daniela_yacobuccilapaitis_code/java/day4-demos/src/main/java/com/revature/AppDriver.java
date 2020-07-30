package com.revature;

import com.revature.passByValue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    public static void main(String[] args) {

        AppUser user = new AppUser ("dyacobucci", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

        final Person p1 = new Person("Billy", "Bob");


    }


}
