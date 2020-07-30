package com.revature;

import com.revature.PassByValue.Person;
import com.revature.varargs.AppUser;
import com.revature.varargs.Role;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AppDriver {
    public static void main(String[] args) {

        AppUser user = new AppUser("yuanfeng","password",new Role[]{Role.DEV});
        user.addRoles(Role.ADMIN, Role.BLDG_MNGR);
        System.out.println(user);

        System.out.println("-------------------------------------");

        int originnal = 10;
        int result = addTwo(originnal);
        System.out.println(originnal);
        System.out.println(result);

        Person originalPerson =new Person("yuanfeng","Gu");
        setFirstNameToBob(originalPerson);
        System.out.println(originalPerson);


    }

    public static int addTwo(int value){
        return value+2;
    }

    public static void setFirstNameToBob(Person person){
        person.setFirstName("Bob");
    }

    public static Person reassignPerson(Person person){
        person = new Person("Alice", "Anderson");
        return person;
    }
}
