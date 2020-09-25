package com.revature.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Table(name="app_users")
@Data @NoArgsConstructor // needed for jackson; not included in data annotation
public class AppUser {

    @Id @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;


}
