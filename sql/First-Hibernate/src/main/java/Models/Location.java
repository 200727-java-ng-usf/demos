package Models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@NamedNativeQuery(name="getLocationById", query="SELECT * FROM locations WHERE locations.id = :id", resultClass=Location.class)
@Entity
@Table(name="locations")
public class Location {
	@Id
	public int id;
	
	@Column
	public String street;
	
	@Column
	public String city;
	
	@Column 
	public String state;
	
	@Column
	public String zip;
	
	@OneToOne
	@JoinColumn(name="manager_id")
	public Employee manager;
	
	@OneToMany(mappedBy="location")
	public Set<Team> teams;
}
