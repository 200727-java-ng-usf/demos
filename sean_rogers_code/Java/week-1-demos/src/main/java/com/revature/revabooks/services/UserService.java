package com.revature.revabooks.services;

import com.revature.revabooks.dao.UserRepository;
import com.revature.revabooks.models.Role;
import com.revature.revabooks.models.User;

import java.util.Set;

public class UserService {
    private UserRepository userRepository;

    public UserService() {

    }

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Set<User> getAllUser() {

        return null;
    }

    public Set<User> getUsersByRole(Role role) {
        return null;
    }

    public User getUserById(Integer id) {
        return null;
    }

    public User getUserByUsername(String username) {
        return null;
    }

    public User authenticate(String username, String pw) {
        return null;
    }

    public User register(User user) {
        return null;
    }

    public boolean updateUser(User user) {
        return false;
    }

    public boolean deteleUserById(Integer id) {
        return false;
    }

    public boolean validateUserFields(User user) {
        return false;
    }
}
