package com.revature.intercom;

import com.revature.dtos.AppUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@FeignClient(name = "user-service", url = "http://localhost:10001")
public interface AppUserClient {


	@GetMapping(value = "/id/{userId}")
	public AppUserDto getUserById(@PathVariable int userId);

}

