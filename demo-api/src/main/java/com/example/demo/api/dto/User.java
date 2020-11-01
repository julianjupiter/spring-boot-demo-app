package com.example.demo.api.dto;

import java.time.LocalDate;

public class User {
    private final long id;
    private final String name;
    private final LocalDate birthday;

    public User(long id, String name, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
