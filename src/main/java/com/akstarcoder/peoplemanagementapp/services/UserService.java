package com.akstarcoder.peoplemanagementapp.services;

import com.akstarcoder.peoplemanagementapp.model.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);
    public List<User> getUsers();
    public User getUser(long userId);
    public User updateUser(User user);
    public User deleteUser(long user);
}
