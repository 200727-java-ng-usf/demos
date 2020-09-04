package Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="employees", schema="advancedhibernateexercise")
public class Employee {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="salary")
    private double salary;

    @ManyToMany
    @JoinTable(
            name="team_members", schema="advancedhibernateexercise",
            joinColumns = {@JoinColumn(name="team_member_id")},
            inverseJoinColumns = {@JoinColumn(name="team_id")}
    )
    private Set<Employee> employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employees=" + employees +
                '}';
    }
}
