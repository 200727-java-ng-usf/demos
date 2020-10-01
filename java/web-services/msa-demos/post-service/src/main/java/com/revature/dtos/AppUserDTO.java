package com.revature.dtos;

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
    private String role;

}
