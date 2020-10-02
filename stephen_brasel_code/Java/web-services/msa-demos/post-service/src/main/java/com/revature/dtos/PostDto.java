package com.revature.dtos;

import com.revature.models.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Data @NoArgsConstructor
public class PostDto {

	private int id;
	private String title;
	private String body;
	private String createdTime;
	private int likes;
	private AppUserDto poster;

	public PostDto(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.body = post.getBody();
		this.createdTime = post.getCreatedTime().toString();
		this.likes = post.getLikes();
//		this.poster.setId(post.getPosterId());
	}

}
