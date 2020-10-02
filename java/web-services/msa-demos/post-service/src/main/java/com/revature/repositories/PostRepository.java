package com.revature.repositories;

import com.revature.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
<<<<<<< HEAD

=======
>>>>>>> f129b70f7553797eaaab4ba93bd74130af1e388d
    List<Post> findPostsByPosterId(int posterId);
}
