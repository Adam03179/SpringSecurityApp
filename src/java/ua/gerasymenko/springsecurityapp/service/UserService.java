package ua.gerasymenko.springsecurityapp.service;

import ua.gerasymenko.springsecurityapp.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
