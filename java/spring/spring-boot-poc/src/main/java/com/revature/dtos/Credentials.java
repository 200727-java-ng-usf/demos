package com.revature.dtos;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data @NoArgsConstructor @AllArgsConstructor
public class Credentials {

    @NotNull @NotBlank
    private String username;

    @NotNull @NotBlank
    private String password;

}
