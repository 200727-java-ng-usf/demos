package com.revature.web.dtos;

import com.revature.models.AppUser;
import com.revature.models.UserRole;
import com.revature.util.RegexUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor @AllArgsConstructor
public class AppUserDto {

	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private boolean isActive;
	private UserRole role;

	public AppUserDto(AppUser user){
		this.id = user.getId();
		this.username = user.getUsername();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.isActive = user.getRole()== UserRole.LOCKED ? false:true;
		this.role = user.getRole();
	}

}
