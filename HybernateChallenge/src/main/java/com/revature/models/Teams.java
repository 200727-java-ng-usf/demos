package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name = "challenge.teams")
public class Teams {

    @Id @GeneratedValue
    @Column(name = "id")
    int id;
    @Column(name = "location_id")
    int locationId;
    @Column(name = "team_lead_id")
    int teamLeadId;

    public Teams(){

    }




}
