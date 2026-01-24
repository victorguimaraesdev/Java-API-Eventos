package com.spring.Api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Api.domain.event.Event;

public interface EventRepositorie extends JpaRepository<Event, UUID> {
    
}
