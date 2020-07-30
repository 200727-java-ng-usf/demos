package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AddDriver {

    public static void main(String[] args){

        AppUser user = new AppUser("swilson", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.ADMIN);
        System.out.println(user);

        System.out.println("--------------------------");

        int original = 10;
        System.out.println(original);


    }

    public static int addTwo(int value){
        return value + 2;
    }
}
