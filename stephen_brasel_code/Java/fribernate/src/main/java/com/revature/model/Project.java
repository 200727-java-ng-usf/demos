package com.revature.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "hibernatetest.projects")
public class Project {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "project_name")
	private String name;

	@Column(name = "project_budget")
	private double budget;

	@ManyToMany
	@JoinTable(
			name = "project_teams",
			joinColumns = {@JoinColumn(name="project_id")},
			inverseJoinColumns = {@JoinColumn(name = "team_id")}
	)
	private Set<Team> teams;

	public Project() {
	}

	public Project(int id, String name, double budget, Set<Team> teams) {
		this.id = id;
		this.name = name;
		this.budget = budget;
//		this.teams = teams;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

//	public Set<Team> getTeams() {
//		return teams;
//	}
//
//	public void setTeams(Set<Team> teams) {
//		this.teams = teams;
//	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return id == project.id &&
				Double.compare(project.budget, budget) == 0 &&
				Objects.equals(name, project.name);
//		&&
//				Objects.equals(teams, project.teams);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, budget
//				, teams
		);
	}

	@Override
	public String toString() {
		return "Project{" +
				"id=" + id +
				", name='" + name + '\'' +
				", budget=" + budget +
//				", teams=" + teams +
				'}';
	}
}
