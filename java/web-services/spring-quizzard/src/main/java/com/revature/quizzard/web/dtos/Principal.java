package com.revature.quizzard.web.dtos;

import com.revature.quizzard.models.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Principal {

    private int id;
    private String username;
    private String role;

    public Principal(AppUser user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.role = user.getRole().toString();
    }

}
