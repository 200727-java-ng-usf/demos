package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations", schema="advancedhibernateexercise")
public class Location {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="manager_id")
    private long managerId;

    @Column(name="street")
    private String street;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip")
    private int zip;

}
