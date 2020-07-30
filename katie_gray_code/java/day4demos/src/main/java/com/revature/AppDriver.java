package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    public static void main(String[] args) {

        AppUser user = new AppUser(8,"kgray", "pass", new Role[] {Role.DEV});
        user.addRoles(Role.TRAINER);
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);

        System.out.println(user.toString());
    }
}
