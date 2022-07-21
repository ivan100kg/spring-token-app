package io.github.ivan100kg.springsecuretoken.service;

import io.github.ivan100kg.springsecuretoken.model.AppUser;
import io.github.ivan100kg.springsecuretoken.model.Role;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser appUser);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    AppUser getUser(String username);

    List<AppUser> getUsers();
}
