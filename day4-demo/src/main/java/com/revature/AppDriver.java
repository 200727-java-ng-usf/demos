package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AppDriver {
    public static void main(String[] args) {

        AppUser user = new AppUser("yuanfeng","password",new Role[]{Role.DEV});
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);
        System.out.println(user);


    }
}
