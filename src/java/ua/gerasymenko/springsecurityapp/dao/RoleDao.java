package ua.gerasymenko.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.gerasymenko.springsecurityapp.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
