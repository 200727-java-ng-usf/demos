package com.revature.quizzard.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Table(name="flash_cards")
@Data @NoArgsConstructor @AllArgsConstructor
public class FlashCard {

    @Id @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false)
    private String question;

    @Column(nullable=false)
    private String answer;

    @ManyToOne
    @JoinColumn
    private AppUser creator;

}
