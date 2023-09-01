package com.example.proyectoRestApi.service;

import com.example.proyectoRestApi.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(String id);
    User createUser(User user);
    User updateUser(String id, User user);
    void deleteUser(String id);
}
