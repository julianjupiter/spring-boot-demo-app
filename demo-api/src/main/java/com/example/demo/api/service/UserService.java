package com.example.demo.api.service;

import com.example.demo.api.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(long id);
}
