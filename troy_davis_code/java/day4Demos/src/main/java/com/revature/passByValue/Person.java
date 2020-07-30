package com.revature.passByValue;

//all objects inherit from the object class either directly or inderectly

import java.util.Objects;

//Person object
public class Person extends Object{ //not neccesary, all objects extend object

    private String firstName;
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

    @Override // annotation is not neccesary in this case as compiler knows that it is overridden
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //diff between == and .equals()
    //  == compares memory address. are they the same object
    // .equals() by default it is the exact same as ==
    //commonly overrriden to compare the actual value equivelency of the two objects

    @Override
    public boolean equals(Object o) {
        //are this instance and o the exact same object? if so return true, since obviously thier values are equal are alse equal
        if (this == o) return true;

        //isnull? is the class of the o the same class as this instance of an object? if so return false
        //REMEMBER: this is to check if the objects are equal of not
        if (o == null || getClass() != o.getClass()) return false;

        //cast object to a person so we can access the person specific fields and methods
        Person person = (Person) o;

        //compare each val of this instance to the person and determine if all values are equal
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    //generates a int value that is pseudo-unique to the object,
    // plays role in data structures
    //such as Hashmaps and HashsETS
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
