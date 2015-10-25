package com.tunco.service;

import com.tunco.model.User;

import java.util.List;

/**
 * Created by dragon on 24-Jan-15.
 */
public interface  UserService {
    void saveUser(User user);

    List<User> getAllUsers();

    void deleteUserByName(String name);

    void deleteUserById(int id);
}
