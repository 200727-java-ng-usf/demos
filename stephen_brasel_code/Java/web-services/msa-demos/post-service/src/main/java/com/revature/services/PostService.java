package com.revature.services;

import com.revature.dtos.AppUserDto;
import com.revature.dtos.PostDto;
import com.revature.intercom.AppUserClient;
import com.revature.models.Post;
import com.revature.repos.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

	private PostRepo postRepo;
	private AppUserClient userClient;

	@Autowired
	public PostService(PostRepo postRepo, AppUserClient client) {
		this.postRepo = postRepo;
		this.userClient = client;
	}

	@Transactional
	public List<PostDto> getAllPosts() {
		return ((List<Post>) postRepo.findAll())
				.stream()
				.map(this::mapPostToDto)
				.collect(Collectors.toList());
	}
	@Transactional
	public List<PostDto> getPostsByPosterId(int posterId) {
		return postRepo.findPostsByPosterId(posterId)
				.stream()
				.map(this::mapPostToDto)
				.collect(Collectors.toList());
	}
	@Transactional
	public PostDto getPostById(int postId) {
		return postRepo.findById(postId)
				.map(this::mapPostToDto)
				.orElseThrow(() -> new RuntimeException("No post found with provided id"));
	}
	private PostDto mapPostToDto(Post post) {
		PostDto postDTO = new PostDto(post);
		AppUserDto userDTO = userClient.getUserById(post.getPosterId());
		postDTO.setPoster(userDTO);
		return postDTO;
	}
}
