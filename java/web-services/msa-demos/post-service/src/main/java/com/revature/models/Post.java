package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@Data @NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Length(max = 35)
    @Column(nullable = false, length = 35)
    private String title;

    @NotBlank
    @Length(max = 2056)
    @Column(nullable = false, length = 2056)
    private String body;

    @PastOrPresent
    @Column(name = "created_time", columnDefinition = "timestamp default current_timestamp")
    private LocalDateTime createdTime;

    @Min(0)
    @Column(columnDefinition = "int default 0")
    private int likes;

    @Column(name = "poster_id", nullable = false)
    private int posterId;

}
