package com.Ikaansh.events.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ikaansh.events.entity.Event;
import com.Ikaansh.events.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

	private final EventService service;


    public EventController(EventService service) {
        this.service = service;
     
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Event getEvent(@PathVariable Long id) {
        return service.getEventById(id);
    }

}
