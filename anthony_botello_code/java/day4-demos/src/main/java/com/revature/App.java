package com.revature;

import com.revature.varargs.*;

public class App 
{
    public static void main( String[] args )
    {
        AppUser user = new AppUser("abotello", "password", new Role[] {Role.DEV});
        user.addRoles(); // varargs allows us to pass in a variable number of arguments to method
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);
        System.out.println(user);
    }
}
