package io.github.ivan100kg.springsecuretoken.service;

import io.github.ivan100kg.springsecuretoken.model.Role;
import io.github.ivan100kg.springsecuretoken.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
