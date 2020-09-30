package com.revature.repos;

import com.revature.models.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // "Instant
public interface UserRepository extends CrudRepository<AppUser, Integer> {

    AppUser findAppUserByUsernameAndPassword(String username, String password);

}
