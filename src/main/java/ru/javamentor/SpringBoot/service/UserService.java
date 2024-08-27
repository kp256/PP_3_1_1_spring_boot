package ru.javamentor.SpringBoot.service;

import ru.javamentor.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    List<User> getUsersByCount(int count);

    User getUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUserById(int id);
}
