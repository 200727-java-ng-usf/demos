package com.revature.web.dtos;

import com.revature.models.AppUser;
import com.revature.models.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data @NoArgsConstructor
public class AppUserDTO {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private UserRole role;

    public AppUserDTO(AppUser user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.role = user.getRole();

        if (this.role == UserRole.LOCKED) {
            this.isActive = false;
        } else {
            this.isActive = true;
        }
    }

}
