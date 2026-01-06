package com.Ikaansh.events.controller;

import com.Ikaansh.events.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

	 private final RegistrationService service;
	 
	  public StudentController(RegistrationService service) {
	        this.service = service;
	    }

	    @PostMapping("/events/{eventId}/register/{userId}")
	    public String register(@PathVariable Long userId,
	                           @PathVariable Long eventId) {
	        service.register(userId, eventId);
	        return "Registered successfully";
	    }
}
