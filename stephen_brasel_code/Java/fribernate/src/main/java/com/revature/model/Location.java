package com.revature.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@NamedNativeQuery(name="ThisIsSome", query="BullPockey")
@Entity
@Table(name = "hibernatetest.locations")
public class Location {
	@Id
	@Column(name = "id")
	private int id;

	@OneToOne
//	@Column(name = "manager_id")
	@JoinColumn(name = "manager_id")
	private Employee manager;

	//If it ends with "To Many", the field is a collection.

	@Column(name = "street")
	private String street;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zip")
	private int zip;

	public Location() {
	}

	public Location(int id, Employee manager, String street, String city, String state, int zip) {
		this.id = id;
		this.manager = manager;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Location location = (Location) o;
		return id == location.id &&
				manager == location.manager &&
				zip == location.zip &&
				Objects.equals(street, location.street) &&
				Objects.equals(city, location.city) &&
				Objects.equals(state, location.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manager, street, city, state, zip);
	}

	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", managerId=" + manager +
				", street='" + street + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip=" + zip +
				'}';
	}
}
