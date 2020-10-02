package com.revature.services;

import com.revature.models.AppUser;
import com.revature.repos.UserRepo;
import com.revature.web.dtos.AppUserDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo repo){
		this.userRepo = repo;
	}

	@Transactional(readOnly = true)
	public List<AppUserDto> getAllUsers(){
		return ((List<AppUser>) userRepo.findAll())
				.stream()
				.map(appUser -> new AppUserDto(appUser))
				.collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public AppUserDto getUserById(int id){
		AppUser user = userRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("No user found with provided id: " + id));
		return new AppUserDto(user);
	}

}
