package com.example.HomeWork.servicies;

import com.example.HomeWork.models.User;
import com.example.HomeWork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
