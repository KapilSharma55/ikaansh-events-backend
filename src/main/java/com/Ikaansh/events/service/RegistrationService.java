package com.Ikaansh.events.service;

import com.Ikaansh.events.entity.*;
import com.Ikaansh.events.repository.EventRepository;
import com.Ikaansh.events.repository.RegistrationRepository;
import com.Ikaansh.events.repository.UserRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final RegistrationRepository regRepo;
    private final EventRepository eventRepo;
    private final UserRepository userRepo;

    public RegistrationService(RegistrationRepository r,
                               EventRepository e,
                               UserRepository u) {
        this.regRepo = r;
        this.eventRepo = e;
        this.userRepo = u;
    }

    public void register(Long userId, Long eventId) {

        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Event event = eventRepo.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));

        // 1️⃣ Duplicate registration check (BEST PRACTICE)
        if (regRepo.existsByUserAndEvent(user, event)) {
            throw new RuntimeException("Already registered for this event");
        }

        // 2️⃣ Capacity check
        if (regRepo.countByEvent(event) >= event.getCapacity()) {
            throw new RuntimeException("Event capacity full");
        }

        // 3️⃣ Save registration
        Registration r = new Registration();
        r.setUser(user);
        r.setEvent(event);

        regRepo.save(r);
    }

    public List<Registration> myEvents(Long userId) {
        User user = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return regRepo.findByUser(user);
    }
}

