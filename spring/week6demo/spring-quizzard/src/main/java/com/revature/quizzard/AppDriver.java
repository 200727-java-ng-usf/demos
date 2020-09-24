package com.revature.quizzard;

import com.revature.quizzard.models.AppUser;
import com.revature.quizzard.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppDriver {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		container.registerShutdownHook();

		UserService userService = container.getBean("userService", UserService.class);
		List<AppUser> users = userService.getAllUsers();
		users.forEach(System.out::println);
	}

}
