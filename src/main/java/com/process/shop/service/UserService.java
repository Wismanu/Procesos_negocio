package com.process.shop.service;

import com.process.shop.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(User userUpdate, Long id);
    User getUserById(Long id);
    List<User> findAllUsers();

}
