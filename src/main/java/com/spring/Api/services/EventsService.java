package com.spring.Api.services;



import java.sql.Date;

import org.springframework.stereotype.Service;

import com.spring.Api.domain.event.EventsRequestDTO;
import com.spring.Api.domain.event.Events;

@Service
public class EventsService {
    public Events createEvent(EventsRequestDTO data) {

       Events newEvent = new Events();
       newEvent.setTitle(data.title());
       newEvent.setDescription(data.description());
       newEvent.setEventUrl(data.eventUrl());
       newEvent.setDate(new Date(data.date()));
       newEvent.setImgUrl(data.imgUrl());

       return newEvent;
    }
}
