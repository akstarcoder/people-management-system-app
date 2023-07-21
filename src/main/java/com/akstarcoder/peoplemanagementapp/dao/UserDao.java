package com.akstarcoder.peoplemanagementapp.dao;


import com.akstarcoder.peoplemanagementapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}
