package com.revature.repos;

import com.revature.models.AppUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // "Instant Repository"
public interface UserRepository extends CrudRepository<AppUser, Integer> {

	AppUser findAppUserByUsernameAndPassword(String username, String password);

//	@Query("from AppUser au where au.username = :username and au.password = :password")
//	AppUser findUserByUNAndPW(String username, String password);

//	@Query()
//	AppUser updateAppUser(AppUser user);
}
