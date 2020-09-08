package com.revature.model;

import org.hibernate.annotations.NamedQuery;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

@NamedQuery(name = "getEmployeeById", query = "from Employee where id = :id")
@Entity
@Table(name = "hibernatetest.employees")
public class Employee {
	@Id
//	@OneToMany(mappedBy = "team_lead_id")
	@Column(name="id")
	private int id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "salary")
	private double salary;

	@OneToOne(mappedBy = "manager")
	private Location loc;

	@ManyToMany(mappedBy = "employees")
	private Set<Team> team;

	//region constructors
	public Employee() {
	}

	public Employee(int id, String firstname, String lastname, double salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	//endregion

	//region gettersAndSetters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//endregion

	//region overridden methods
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return id == employee.id &&
				Double.compare(employee.salary, salary) == 0 &&
				Objects.equals(firstname, employee.firstname) &&
				Objects.equals(lastname, employee.lastname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstname, lastname, salary);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				", salary=" + salary +
				'}';
	}
	//endregion
}
