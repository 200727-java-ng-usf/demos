package com.revature.repos;

import com.revature.models.AppUser;
import com.revature.models.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<AppUser, Integer> {

	List<AppUser> findAppUsersByRole(UserRole role);
	AppUser findAppUserByUsername(String username);
	AppUser findAppUserByEmail(String email);
}
