package com.revature.passbyvalue;

import java.util.Objects;

/*
    All objects inherit from the Object class (either explicitly or implicitly)
    so it is not necessary to explicitly declare a class to extend Object:
        public class Person extends Object {}

        - Be aware that the "final" keyword disallows extension of a class:
            public final class Person {}
            public class Teacher extends Person {}
        this is not valid as Person cannot be extended
 */
public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    @Override // not technically necessary, but helpful for code readability
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /*
        differences between: == and .equals()

            == compares memory addresses of two objects
                + are they the same object?

            .equals()
                + by default, it is the exact same as ==
                + commonly overridden to compare the value equivalency of two objects
     */
    @Override
    public boolean equals(Object o) {

        // do this and o refer to the same object in the heap?
        if (this == o) return true;

        // does o actually refer to an instance of an object of this class type?
        if (o == null || getClass() != o.getClass()) return false;

        // since o is an instance of this class, cast it and assign it to a variable of this class type
        Person person = (Person) o;

        // check the value of each field of this instance to that of person and
        // determine if each field has the same value for both instances
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    // Generates an int value that is pseudo-unique to the object, plays a role in
    // data structures such as HashMaps and HashSets (more on that next week...)
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    // The old methods of overriding .equals and .hashcode, pre-Java 7
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
