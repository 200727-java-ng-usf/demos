package Models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	@NamedQuery(name="query1", query="myquery"),
	@NamedQuery(name="query2", query="somequerys")
})
@Entity
@Table(name="teams")
public class Team {
	@Id
	public int id;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	public Location location;
	
	@ManyToMany
	@JoinTable(
		name="team_members",
		joinColumns = { @JoinColumn(name="team_id") },
		inverseJoinColumns = { @JoinColumn(name="team_member_id") }
	)
	public Set<Employee> teamMembers;
}
