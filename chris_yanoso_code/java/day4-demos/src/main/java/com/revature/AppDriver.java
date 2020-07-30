package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {

    public static void main(String[] args) {

        AppUser user = new AppUser("CYanoso", "password", new Role[] {Role.ADMIN});
        user.addRoles(Role.DEV); //variable arguments allows us to pass in a varying number of arguments
        user.addRoles(); //can even pass in 0 vars
        System.out.println(user);
    }

}
