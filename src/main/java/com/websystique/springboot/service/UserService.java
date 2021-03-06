package com.websystique.springboot.service;


import com.websystique.springboot.model.User;

import java.util.List;


public interface UserService {

    User findById(long id);

    void saveUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    boolean isUserExist(User user);

    void changeStatus(User user);
}