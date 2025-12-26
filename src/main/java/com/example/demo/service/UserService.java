package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

    User createuser(User user);

    List<User> getallusers();
}
