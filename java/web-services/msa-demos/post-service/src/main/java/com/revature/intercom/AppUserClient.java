package com.revature.intercom;

import com.revature.dtos.AppUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@FeignClient(name="user-service")
public interface AppUserClient {

    @GetMapping(value = "/id/{userId}")
    AppUserDTO getUserById(@PathVariable int userId);

}
