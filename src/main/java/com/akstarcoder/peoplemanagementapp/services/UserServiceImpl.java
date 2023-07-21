package com.akstarcoder.peoplemanagementapp.services;

import com.akstarcoder.peoplemanagementapp.dao.UserDao;
import com.akstarcoder.peoplemanagementapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public  class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public List<User> getUsers() {

        return userDao.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userDao.findById(userId).get();
    }

    @Override
    public User updateUser(User user) {
        userDao.save(user);
        return  user;
    }

    @Override
    public User deleteUser(long userId) {
        User user = userDao.findById(userId).get();
        userDao.delete(user);
        return user;
    }

}
