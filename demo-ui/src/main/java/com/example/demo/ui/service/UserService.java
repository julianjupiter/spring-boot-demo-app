package com.example.demo.ui.service;

import com.example.demo.ui.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(long id);
}
