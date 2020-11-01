package com.example.demo.ui.service;

import com.example.demo.ui.dto.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
class UserServiceImpl implements UserService {
    private final RestTemplate restTemplate;
    private final String baseUrl;

    UserServiceImpl(RestTemplate restTemplate, @Value("${api.service.base.url}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    @Override
    public List<User> findAll() {
        ResponseEntity<User[]> response = restTemplate.getForEntity(baseUrl + "/users", User[].class);
        User[] users = response.getBody();

        if (users != null) {
            return List.of(users);
        }

        return List.of();
    }

    @Override
    public Optional<User> findById(long id) {
        ResponseEntity<User> response = restTemplate.getForEntity(baseUrl + "/users/{id}", User.class, id);

        if (response.getStatusCode() == HttpStatus.OK) {
            return Optional.ofNullable(response.getBody());
        }

        return Optional.empty();
    }
}
