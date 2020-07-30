package com.revature.passbyvalue;

import java.util.Objects;

public class Person {

    private  String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
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
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
// is this instance and o the same object? if so return true since their values are also equal
    //is o null? is the class of o the same as the class of this instance? if not, they can never be equal so return false
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;  //cast o into a Person object, so that we can access the Person-specific fields and methods
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }
//generates a int value that is pseudo-unique; plays a role in data structures such as HashMaps and HashSets
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
