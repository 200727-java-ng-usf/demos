package com.revature.services;

import com.revature.models.Post;
import com.revature.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepo;

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

    @Transactional
    public Post getPostById(int postId) {
        return postRepo.findById(postId)
                        .orElseThrow(() -> new RuntimeException("No post found with provided id"));
    }

}
