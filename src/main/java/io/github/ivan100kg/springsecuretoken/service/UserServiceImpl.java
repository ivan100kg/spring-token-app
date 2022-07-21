package io.github.ivan100kg.springsecuretoken.service;

import io.github.ivan100kg.springsecuretoken.model.AppUser;
import io.github.ivan100kg.springsecuretoken.model.Role;
import io.github.ivan100kg.springsecuretoken.repo.RoleRepo;
import io.github.ivan100kg.springsecuretoken.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    Logger logger = Logger.getAnonymousLogger();

    @Override
    @Transactional
    public AppUser saveUser(AppUser appUser) {
        logger.log(Level.INFO, "Saving new user {} to the DB");
        return userRepo.save(appUser);
    }

    @Override
    @Transactional
    public Role saveRole(Role role) {
        logger.log(Level.INFO, "Saving new role {} to the DB");
        return roleRepo.save(role);
    }

    @Override
    @Transactional
    public void addRoleToUser(String username, String roleName) {
        logger.log(Level.INFO, "Adding new role {} to User {}");
        AppUser appUser = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        appUser.getRoles().add(role);
    }

    @Override
    @Transactional
    public AppUser getUser(String username) {
        logger.log(Level.INFO, "Fetching user");
        return userRepo.findByUsername(username);
    }

    @Override
    @Transactional
    public List<AppUser> getUsers() {
        logger.log(Level.INFO, "Fetching all users");
        return userRepo.findAll();
    }
}
