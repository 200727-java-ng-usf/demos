package com.revature.quizzard.web.controllers;

import com.revature.quizzard.exceptions.ResourcePersistenceException;
import com.revature.quizzard.models.AppUser;
import com.revature.quizzard.services.UserService;
import com.revature.quizzard.web.dtos.ErrorResponse;
import com.revature.quizzard.web.dtos.Principal;
import com.revature.quizzard.web.security.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController implies
//      - @Controller at the class level
//      - @ResponseBody on the return type of each mapping method
// In test controller, we did the two above annotations manually. Here, we will use RestController to imply them
@RestController
// DON'T use request mapping unless you are mapping to something
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired // don't need this annotation for constructor-injection
    public UserController (UserService userService) {
        this.userService = userService;
    }

    @Secured(allowedRoles={"Admin", "Dev"})
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE) // good practice to always include this even though it is set to JSON by default
    public List<AppUser> getAllUsers() {
        return userService.getAllUsers();
    }

    // need to specify a particular value, otherwise get request to /users is AMBIGUOUS
    @GetMapping(value="/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE) // produces vs consumes: consumes will ensure wrong mediatypes are handled
    public AppUser getUserById (@PathVariable int id) { // if name of pathvariable is the same as name in {}, then you don't need a value param for pathvariable
        return userService.findUserById(id);
    }

    @GetMapping(value="/search")
    public AppUser getUserByUsername (@RequestParam String username) {
        return userService.findUserByUsername(username);
    }

    @ResponseStatus(value= HttpStatus.CREATED)
    @PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AppUser registerNewUser(@RequestBody AppUser newUser) {
        return userService.register(newUser);
    }

}
