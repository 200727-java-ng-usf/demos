package com.revature.models;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne
    @JoinColumn(name = "team_lead_id")
    private  Employee employee;

    @ManyToMany
    @JoinTable(name = "team_members",
    joinColumns = {@JoinColumn(name = "team_id")},
    inverseJoinColumns = {@JoinColumn(name = "team_member_id")})
    private Set<Employee> employees;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
//    @OneToOne(mappedBy = "team_id")
//    private TeamMember teamMember;
//
//    @OneToOne(mappedBy = "team_id")
//    private ProjectTeam projectTeam;
//
//    public ProjectTeam getProjectTeam() {
//        return projectTeam;
//    }
//
//    public void setProjectTeam(ProjectTeam projectTeam) {
//        this.projectTeam = projectTeam;
//    }
//
//    public TeamMember getTeamMember() {
//        return teamMember;
//    }
//
//    public void setTeamMember(TeamMember teamMember) {
//        this.teamMember = teamMember;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
