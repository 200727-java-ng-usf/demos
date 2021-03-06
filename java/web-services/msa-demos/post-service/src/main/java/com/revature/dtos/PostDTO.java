package com.revature.dtos;

import com.revature.models.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data @NoArgsConstructor
public class PostDTO {

    private int id;
    private String title;
    private String body;
    private String createdTime;
    private int likes;
    private AppUserDTO poster;

    public PostDTO(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.body = post.getBody();
        this.createdTime = post.getCreatedTime().toString();
        this.likes = post.getLikes();
    }

}
