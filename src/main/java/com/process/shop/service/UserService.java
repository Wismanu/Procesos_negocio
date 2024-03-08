package com.process.shop.service;

import com.process.shop.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    User createUser(User user);
    User updateUser(User userUpdate, Long id);
    User gerUserById(Long id);
    List<User> findAllUsers();

}
