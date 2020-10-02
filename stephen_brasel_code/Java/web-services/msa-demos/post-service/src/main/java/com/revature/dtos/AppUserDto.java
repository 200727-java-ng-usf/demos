package com.revature.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {

	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private boolean isActive;
	private String role;
}
