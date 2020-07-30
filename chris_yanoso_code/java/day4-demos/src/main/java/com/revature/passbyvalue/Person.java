package com.revature.passbyvalue;

import java.util.Objects;

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

    @Override //not needed to override, annotation is mostly for devs
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        //is this instance and o the exact same object?
        if (this == o) return true;
        //is o null? is the class of o the same as the class of this instance?
        if (o == null || getClass() != o.getClass()) return false;
        //cast o into a person object, so we can access the person-specific fields and methods
        Person person = (Person) o;
        //compare each value of this instance to the person adn determine if all values are the same
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    //Generates a int value that is pseudo-unique to the object, plays a role in data structures
    //such as HashMaps and HashSets
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
