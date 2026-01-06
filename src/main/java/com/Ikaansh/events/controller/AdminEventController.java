package com.Ikaansh.events.controller;

import com.Ikaansh.events.dto.EventRequest;
import com.Ikaansh.events.entity.Event;
import com.Ikaansh.events.service.EventService;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/events")
public class AdminEventController {

	  private final EventService service;

	    public AdminEventController(EventService service) {
	        this.service = service;
	    }

	    @PostMapping
	    public Event create(@RequestBody EventRequest r) {
	        Event e = new Event();
	        e.setTitle(r.title);
	        e.setDescription(r.description);
	        e.setDateTime(r.dateTime);
	        e.setCapacity(r.capacity);
	        e.setDuration(r.duration);
	        e.setSpeaker(r.speaker);
	        e.setEventType(r.eventType);
	        e.setLocation(r.location);
	        e.setOnlineLink(r.onlineLink);
	        return service.create(e);
	    }

	    @GetMapping
	    public List<Event> all() {
	        return service.getAll();
	    }
}
