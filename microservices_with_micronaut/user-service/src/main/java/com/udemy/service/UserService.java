package com.udemy.service;

import com.udemy.client.Preference;
import com.udemy.client.PreferenceClient;
import com.udemy.exception.UserNotFoundException;
import com.udemy.model.User;
import com.udemy.model.UserResponse;
import com.udemy.repository.UserRepository;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class UserService {

    private final UserRepository userRepository;
    private final PreferenceClient preferenceClient;

    public UserService(UserRepository userRepository, PreferenceClient preferenceClient) {
        this.userRepository = userRepository;
        this.preferenceClient = preferenceClient;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public long getUserCount() {
        return userRepository.count();
    }

    private User getUser(int id) {
        return userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);
    }

    public UserResponse getUserDetails(int id) {
        User user = getUser(id);
        Optional<Preference> optionalPreference = preferenceClient.getUserPreference(id);
        Preference preference = optionalPreference.orElse(null);

        return UserResponse.builder()
                .user(user)
                .preference(preference)
                .build();
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
