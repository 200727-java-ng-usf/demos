package com.revature.controllers;

import com.revature.dtos.AppUserDto;
import com.revature.dtos.PostDto;
import com.revature.models.Post;
import com.revature.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
	private final PostService postService;

	@Autowired
	public PostController(PostService service) {
		this.postService = service;
	}

	@GetMapping
	public List<PostDto> getAllPosts(){
		return postService.getAllPosts();
	}

	@GetMapping(value = "/poster/{posterId}")
	public List<PostDto> getPostsByPosterId(@PathVariable int posterId){
		return postService.getPostsByPosterId(posterId);
	}

	@GetMapping(value = "/id/{postId}")
	public PostDto getPostById(@PathVariable int postId){
		return postService.getPostById(postId);
	}

	@GetMapping(value = "/id/{id}")
	public AppUserDto getUserById(int userId){
		return null;
	}
}
