package com.revature.model;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

//@NamedQueries({
//		@NamedQuery(name="query", query = "myquery"),
//		@NamedQuery(name="query", query = "myquery"),
//		@NamedQuery(name="query", query = "myquery")
//})
@Entity
@Table(name = "hibernatetest.teams")
public class Team {
	@Id
	@Column(name = "id")
	private int id;

//	@ManyToOne(targetEntity = Location.class)
	@Column(name = "location_id")
	private int locationId;

	@Column(name = "team_lead_id")
	private int teamLeadId;

	@ManyToMany
	@JoinTable(
			name = 					"team_members",
			joinColumns = 			{@JoinColumn(name="team_id")},
			inverseJoinColumns = 	{@JoinColumn(name = "team_member_id")}
	)
	private Set<Employee> employees;

	@ManyToMany(mappedBy = "teams")
	private Set<Project> projects;

	public Team() {
	}

	public Team(int id, int locationId, int teamLeadId/*, Set<Employee> employees*/) {
		this.id = id;
		this.locationId = locationId;
		this.teamLeadId = teamLeadId;
//		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getTeamLeadId() {
		return teamLeadId;
	}

	public void setTeamLeadId(int teamLeadId) {
		this.teamLeadId = teamLeadId;
	}
//
//	public Set<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(Set<Employee> employees) {
//		this.employees = employees;
//	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Team team = (Team) o;
		return id == team.id &&
				locationId == team.locationId &&
				teamLeadId == team.teamLeadId;
//		&&
//				Objects.equals(employees, team.employees);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, locationId, teamLeadId/*, employees*/);
	}

	@Override
	public String toString() {
		return "Team{" +
				"id=" + id +
				", locationId=" + locationId +
				", teamLeadId=" + teamLeadId +
//				", employees=" + employees +
				'}';
	}
}
