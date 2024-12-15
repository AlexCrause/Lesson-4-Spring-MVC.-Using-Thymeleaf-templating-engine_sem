package com.example.HomeWork.repository;

import com.example.HomeWork.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
