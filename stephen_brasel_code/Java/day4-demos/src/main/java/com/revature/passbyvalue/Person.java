package com.revature.passbyvalue;

import java.util.Objects;

// All Objects inherit from the Object class (either directly or indirectly)
// not necessary to delcare "extends Object}, as all objects
public class Person extends Object{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //region GETTERSANDSETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /*
        differences between == and .equals()

            == compares memory addresses of two objects (are they the same object?)

            .equals()
                + by defgault it is the exact same as =
                + commonly overridden to compare the value equivalency of two objects
     */

    @Override
    public boolean equals(Object o) {
        //is this instance and o the exact same obvject? if so, return true, since they';re obviously equal
        if (this == o) return true;

        // if o null? is the class of o different from this instance? if so, they can never be equal so return false
        if (o == null || this.getClass() != o.getClass()) return false;

        // Cast o into a Person object, so that we can access the Person-specific fields and methods
        Person person = (Person) o;

        // Compare each value of this instance to the values of o and determine if all value
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    // Generates an int value that is pseudo-unique, plays a role in data structures
    // such as HashMaps and HashSets (more on that next week...)
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
//        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = firstName != null ? firstName.hashCode() : 0;
//        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
//        return result;
//    }
}
