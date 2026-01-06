package com.Ikaansh.events.service;

import org.springframework.stereotype.Service;


import com.Ikaansh.events.entity.Event;
import com.Ikaansh.events.repository.EventRepository;


import java.util.List;
@Service
public class EventService {

	  private final EventRepository repo;

	    public EventService(EventRepository repo) {
	        this.repo = repo;
	    }

	    public Event create(Event e) {
	        return repo.save(e);
	    }

	    public List<Event> getAll() {
	        return repo.findAll();
	    }

	    public Event get(Long id) {
	        return repo.findById(id).orElseThrow();
	    }

	    public void delete(Long id) {
	        repo.deleteById(id);
	    }

		public Event getEventById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}	
}
