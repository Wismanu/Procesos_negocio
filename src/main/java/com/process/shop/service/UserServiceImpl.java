package com.process.shop.service;

import com.process.shop.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User userUpdate, Long id) {
        return null;
    }

    @Override
    public User gerUserById(Long id) {

        return new User();
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
