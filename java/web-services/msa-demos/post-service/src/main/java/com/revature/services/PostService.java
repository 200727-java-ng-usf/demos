package com.revature.services;

<<<<<<< HEAD
=======
import com.revature.dtos.AppUserDTO;
import com.revature.dtos.PostDTO;
import com.revature.intercom.AppUserClient;
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
import com.revature.models.Post;
import com.revature.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.stream.Collectors;
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d

@Service
public class PostService {

    private PostRepository postRepo;
<<<<<<< HEAD

    @Autowired
    public PostService(PostRepository repo) {
        this.postRepo = repo;
    }

    @Transactional
    public List<Post> getAllPosts() {
        return (List<Post>) postRepo.findAll();
    }

    @Transactional
    public List<Post> getPostsByPosterId(int posterId) {
        return postRepo.findPostsByPosterId(posterId);
    }

    public Post getPostById(int postId) {
        return postRepo.findById(postId).orElseThrow(() -> new RuntimeException("No post found with provided id."));
    }
=======
    private AppUserClient userClient;

    @Autowired
    public PostService(PostRepository repo, AppUserClient client) {
        this.postRepo = repo;
        this.userClient = client;
    }

    @Transactional
    public List<PostDTO> getAllPosts() {
        return ((List<Post>) postRepo.findAll())
                .stream()
                .map(this::mapPostToDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public List<PostDTO> getPostsByPosterId(int posterId) {
        return postRepo.findPostsByPosterId(posterId)
                .stream()
                .map(this::mapPostToDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public PostDTO getPostById(int postId) {
        return postRepo.findById(postId)
                        .map(this::mapPostToDto)
                        .orElseThrow(() -> new RuntimeException("No post found with provided id"));
    }

    private PostDTO mapPostToDto(Post post) {
        PostDTO postDTO = new PostDTO(post);
        AppUserDTO userDTO = userClient.getUserById(post.getPosterId());
        postDTO.setPoster(userDTO);
        return postDTO;
    }

>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
}
