package com.revature.quizzard.repositories;

import com.revature.quizzard.models.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    Optional<AppUser> findAppUserByUsernameAndPassword(String username, String password);
    Optional<AppUser> findAppUserByUsername(String username);
    Optional<AppUser> findAppUserByEmail(String email);
}
