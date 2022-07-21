package io.github.ivan100kg.springsecuretoken.repo;

import io.github.ivan100kg.springsecuretoken.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
