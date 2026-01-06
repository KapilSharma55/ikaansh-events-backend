package com.Ikaansh.events.controller;

import com.Ikaansh.events.dto.*;
import com.Ikaansh.events.entity.Role;
import com.Ikaansh.events.service.UserService;
import org.springframework.web.bind.annotation.*;
@RestController          // 👈 Ye missing tha
@RequestMapping("/auth")
public class AuthController {
	   private final UserService service;

	    public AuthController(UserService service) {
	        this.service = service;
	    }

	    @PostMapping("/register")
	    public String register(@RequestBody RegisterRequest r) {
	        service.register(r.name, r.email, r.password, Role.valueOf(r.role));
	        return "User registered";
	    }
}
