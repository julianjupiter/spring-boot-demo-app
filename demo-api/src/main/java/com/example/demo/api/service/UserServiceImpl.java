package com.example.demo.api.service;

import com.example.demo.api.dao.UserDao;
import com.example.demo.api.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public Optional<User> findById(long id) {
        return userDao.findById(id);
    }
}
