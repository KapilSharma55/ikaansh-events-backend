package com.Ikaansh.events.service;


import com.Ikaansh.events.entity.*;
import com.Ikaansh.events.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserService(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }    
        public User register(String name, String email, String password, Role role) {
            User u = new User();
            u.setName(name);
            u.setEmail(email);
            u.setPassword(encoder.encode(password));
            u.setRole(role);
            return repo.save(u);
        
    }
}
