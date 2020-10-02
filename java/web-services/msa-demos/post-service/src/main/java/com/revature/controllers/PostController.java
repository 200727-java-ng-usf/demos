package com.revature.controllers;

<<<<<<< HEAD
=======
import com.revature.dtos.PostDTO;
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
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
<<<<<<< HEAD
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping(value = "/id/{posterId}")
    public List<Post> getPostsByPosterId(@PathVariable int posterId) {
=======
    public List<PostDTO> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping(value = "/poster/{posterId}")
    public List<PostDTO> getPostsByPosterId(@PathVariable int posterId) {
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
        return postService.getPostsByPosterId(posterId);
    }

    @GetMapping(value = "/id/{postId}")
<<<<<<< HEAD
    public Post getPostBy(@PathVariable int postId) {
        return postService.getPostById(postId);
    }
=======
    public PostDTO getPostById(@PathVariable int postId) {
        return postService.getPostById(postId);
    }

>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
}
