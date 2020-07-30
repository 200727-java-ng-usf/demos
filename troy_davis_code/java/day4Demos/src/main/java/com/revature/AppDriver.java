package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    //you can legally use var args with the main method signiture but this is not common
    public static void main(String... args) {

        AppUser user = new AppUser("troy", "pass", new Role[]{Role.TRAINER});
        user.addRolls(Role.DEV, Role.BLDG_MNGR);
        user.addRolls();// can pass in a varioable number of arguments
        System.out.println(user);
    }
}
