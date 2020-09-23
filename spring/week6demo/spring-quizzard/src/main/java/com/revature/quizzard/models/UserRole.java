package com.revature.quizzard.models;

import java.util.Arrays;

public enum UserRole {

	ADMIN("Admin"),
	DEV("Dev"),
	BASIC_USER("Basic User"),
	LOCKED("Locked");

	private String rolename;

	UserRole(String name){
		this.rolename = name;
	}

	public static UserRole getByName(String name){
		return Arrays.stream(UserRole.values())
				.filter(userRole -> userRole.rolename.equals(name))
				.findFirst()
				.orElse(LOCKED);
	}

	@Override
	public String toString() {
		return this.rolename;
	}
}
