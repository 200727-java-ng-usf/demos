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

    @Override
    public boolean equals(Object o) {
        // is this inctance and o the exact same object? if so return true, bc duh
        if (this == o) return true;

        //is o null? are their classes the same?
        if (o == null || getClass() != o.getClass()) return false;

        // cast o into a person object so we can access the person-specific fields and methods
        Person person = (Person) o;

        //compare each value of the instance to the person and determine if all values are the same
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }


    // Generates an int value that is psuedo-unique to the object, plays a role in data structures such as
    // HashMaps and HashSets
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }



}
