package io.github.ivan100kg.springsecuretoken.api;

import io.github.ivan100kg.springsecuretoken.model.AppUser;
import io.github.ivan100kg.springsecuretoken.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }
}
