package io.github.ivan100kg.springsecuretoken.repo;

import io.github.ivan100kg.springsecuretoken.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
