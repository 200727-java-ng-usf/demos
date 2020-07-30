package com.revature;


import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    // You can legally use variable arguments with the main method signature, but that isn't super common
    public static void main(String... args) {

        AppUser user = new AppUser("wsingleton", "password", new Role[] { Role.TRAINER });

        // variable arguments allows us to pass in a varying number of arguments to the addRoles method
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

    }

}
