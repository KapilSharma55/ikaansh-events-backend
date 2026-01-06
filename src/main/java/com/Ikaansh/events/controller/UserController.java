package com.Ikaansh.events.controller;

import com.Ikaansh.events.entity.Role;
import com.Ikaansh.events.entity.User;
import com.Ikaansh.events.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User register(@RequestBody UserRequest request) {
        return userService.register(
            request.getName(),
            request.getEmail(),
            request.getPassword(),
            request.getRole()
        );
    }

    // DTO class
    public static class UserRequest {
        private String name;
        private String email;
        private String password;
        private Role role;

        // getters and setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }

        public Role getRole() { return role; }
        public void setRole(Role role) { this.role = role; }
    }
}

