package Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="teams", schema="advancedhibernateexercise")
public class Team {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="location_id")
    private long locationId;

    @Column(name="team_lead_id")
    private long teamLeadId;

    @ManyToMany(mappedBy="employees")
    private Set<Employee> employees;

//@OneToMany(mappedBy="team")

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public long getTeamLeadId() {
        return teamLeadId;
    }

    public void setTeamLeadId(long teamLeadId) {
        this.teamLeadId = teamLeadId;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", locationId=" + locationId +
                ", teamLeadId=" + teamLeadId +
                ", employees=" + employees +
                '}';
    }
}
