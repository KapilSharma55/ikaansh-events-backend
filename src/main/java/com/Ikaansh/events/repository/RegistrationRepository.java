package com.Ikaansh.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ikaansh.events.entity.Registration;
import com.Ikaansh.events.entity.*;

import java.util.List;
import java.util.Optional;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {



	    boolean existsByUserAndEvent(User user, Event event);

	    long countByEvent(Event event);

    Optional<Registration> findByUserAndEvent(User user, Event event);

    List<Registration> findByUser(User user);

    List<Registration> findByEvent(Event event);
}
