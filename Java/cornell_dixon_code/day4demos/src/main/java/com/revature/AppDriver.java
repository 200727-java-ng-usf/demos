package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

import java.awt.peer.SystemTrayPeer;

public class AppDriver {
    public static void main(String[] args){

        AppUser user = new AppUser("cdixon", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR);
        System.out.println(user);

    }
}
