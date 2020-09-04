package com.revature.models;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "team_members")
public class TeamMember implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @OneToOne
    @JoinColumn(name = "team_member_id")
    private Employee teamMember;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Employee getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(Employee employee) {
        this.teamMember = teamMember;
    }
}
