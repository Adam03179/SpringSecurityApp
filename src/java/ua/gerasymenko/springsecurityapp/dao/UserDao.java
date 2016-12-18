package ua.gerasymenko.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.gerasymenko.springsecurityapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
