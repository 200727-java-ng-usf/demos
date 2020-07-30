package com.revature.passbyvalue;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override // not technicallly needed, but good to include for other devs
    public String toString(){
        return "Person{" + "firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

    /*
        differences between: == and .equal()
            - '==' compares memory addresses of two objects (are they the same object?)
            - '.equals()'
                + by default, is the exact same as '=='
                + commonly overridden
    */
    @Override
    public boolean equals(Object o){

        // is this instance and 'o' the exact same object -- i.e., same memory address
        if(o == this) return true;

        // is 'o' null? is the class of 'o' the same as the class of this instance? if not, they can never be equal so return false
        if(o == null || !(o instanceof Person)) return false;

        // Cast 'o' into a Person object, so that we can access the Person-specific fields and methods
        Person p = (Person) o;
        return p.firstName.equals(this.firstName) && 
                p.lastName.equals(this.lastName);
    }

    // Generates an int value that is pseudo-unique, plays a role in data structures
    // such as HashMaps and HashSets
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName);
    }

}