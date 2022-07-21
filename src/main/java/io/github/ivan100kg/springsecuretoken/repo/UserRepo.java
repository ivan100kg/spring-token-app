package io.github.ivan100kg.springsecuretoken.repo;

import io.github.ivan100kg.springsecuretoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
