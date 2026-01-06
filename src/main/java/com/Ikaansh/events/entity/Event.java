package com.Ikaansh.events.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "events")
public class Event {

	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String title;
	    private String description;
	    private LocalDateTime dateTime;
	    private int duration;
	    private int capacity;
	    private String speaker;
	    private String eventType;
	    private String location;
	    private String onlineLink;
	    

	    // getters & setters
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public LocalDateTime getDateTime() {
			return dateTime;
		}
		public void setDateTime(LocalDateTime dateTime) {
			this.dateTime = dateTime;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public String getSpeaker() {
			return speaker;
		}
		public void setSpeaker(String speaker) {
			this.speaker = speaker;
		}
		public String getEventType() {
			return eventType;
		}
		public void setEventType(String eventType) {
			this.eventType = eventType;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getOnlineLink() {
			return onlineLink;
		}
		public void setOnlineLink(String onlineLink) {
			this.onlineLink = onlineLink;
		}

	    
	    
	}


