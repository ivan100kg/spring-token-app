package io.github.ivan100kg.springsecuretoken.service;

import io.github.ivan100kg.springsecuretoken.model.Role;
import io.github.ivan100kg.springsecuretoken.model.User;
import io.github.ivan100kg.springsecuretoken.repo.RoleRepo;
import io.github.ivan100kg.springsecuretoken.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    @Override
    @Transactional
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    @Transactional
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    @Transactional
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    @Transactional
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    @Transactional
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
