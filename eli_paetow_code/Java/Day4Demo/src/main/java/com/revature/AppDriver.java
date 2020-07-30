package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

import java.sql.SQLOutput;

public class AppDriver {

    public static void main(String[] args) {

        AppUser user = new AppUser("elipaetow", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.BLDG_MNGR);

        System.out.println(user);


    }

}
