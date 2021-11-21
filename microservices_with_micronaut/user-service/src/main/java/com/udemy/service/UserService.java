package com.udemy.service;

import com.udemy.exception.UserNotFoundException;
import com.udemy.model.User;
import com.udemy.repository.UserRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);
    }

    public User updateUser(int id, User user) {
        User prevUser = getUser(id);
        prevUser.setName(user.getName());
        prevUser.setMobileNumber(user.getMobileNumber());
        prevUser.setEmail(user.getEmail());

        return userRepository.update(prevUser);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
