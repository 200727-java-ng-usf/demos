package Models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@NamedQuery(name="getEmployeeById", query="from Employee where id = :id")
@Entity
@Table(name="employees")
public class Employee {
	@Id
	public int id;
	
	@Column(name="first_name")
	public String firstName;
	
	@Column(name="last_name")
	public String lastName;
	
	@Column
	public double salary;
	
	@OneToOne(mappedBy="manager")
	public Location managingLocation;
	
	@ManyToMany(mappedBy="teamMembers")
	public Set<Team> teams;
}
