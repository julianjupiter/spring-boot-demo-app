package com.example.demo.api.dao;

import com.example.demo.api.dto.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
class UserDaoImpl implements UserDao {
    private static final List<User> users = List.of(
            new User(1L, "Jose Rizal", LocalDate.of(1861, 6, 19)),
            new User(2L, "Andres Bonifacio", LocalDate.of(1863, 11, 30)),
            new User(3L, "Apolinario Mabini", LocalDate.of(1864, 7, 23))
    );

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(long id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }
}

