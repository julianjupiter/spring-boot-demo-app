package com.example.demo.api.dao;

import com.example.demo.api.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> findAll();

    Optional<User> findById(long id);
}
