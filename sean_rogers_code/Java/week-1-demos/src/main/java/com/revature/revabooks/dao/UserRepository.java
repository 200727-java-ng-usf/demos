package com.revature.revabooks.dao;

import com.revature.revabooks.models.Role;
import com.revature.revabooks.models.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Set;

public class UserRepository implements CrudRepository<User>{

    @Override
    public User save(User user) {

        return user;
    }
    @Override
    public Set<User> findAll() {

        return null;
    }

    public Set<User> findUsersByRole(Role role) {

        return null;
    }

    @Override
    public User findById(Integer id) {

        return null;
    }

    public User findUserByUsername(String username) {

        return null;
    }

    public User findUserByCredentials(String username, String pw) {

        return null;
    }

    @Override
    public boolean update(User user) {

        return false;
    }

    @Override
    public boolean deleteById(Integer id) {

        return false;
    }

}
