package com.revature.quizzard.services;

import com.revature.quizzard.models.AppUser;
import com.revature.quizzard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepo;

    @Autowired
    public UserService(UserRepository repo) {
        userRepo = repo;
    }

    @Transactional(readOnly=true)
    public List<AppUser> getAllUsers() {
        return userRepo.findAll();
    }

}
