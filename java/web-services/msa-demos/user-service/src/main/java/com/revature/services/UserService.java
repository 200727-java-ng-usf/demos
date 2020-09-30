package com.revature.services;

import com.revature.models.AppUser;
import com.revature.repos.UserRepository;
import com.revature.web.dtos.AppUserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private UserRepository userRepo;

    public UserService(UserRepository repo) {
        this.userRepo = repo;
    }

    @Transactional(readOnly=true)
    public List<AppUserDTO> getAllUsers() {
        return ((List<AppUser>) userRepo.findAll())
                .stream()
                .map(appUser -> new AppUserDTO(appUser))
                .collect(Collectors.toList());
    }
}
