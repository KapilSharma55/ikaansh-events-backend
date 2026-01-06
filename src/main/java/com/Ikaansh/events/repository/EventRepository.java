package com.Ikaansh.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ikaansh.events.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
