package com.udemy.service;

import com.udemy.model.User;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class UserService {

    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        users.add(user);
        return user;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public User updateUser(int id, User user) {
        User prevUser = getUser(id);
        prevUser.setName(user.getName());
        prevUser.setMobileNumber(user.getMobileNumber());
        prevUser.setEmail(user.getEmail());

        return prevUser;
    }

    public void deleteUser(int id) {
        User userToBeDeleted = getUser(id);
        users.remove(userToBeDeleted);
    }

}
