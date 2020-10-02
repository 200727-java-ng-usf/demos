package com.revature.repos;

import com.revature.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

	List<Post> findPostsByPosterId(int posterId);
}
