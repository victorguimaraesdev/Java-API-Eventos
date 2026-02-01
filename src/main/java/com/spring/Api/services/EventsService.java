package com.spring.Api.services;



import java.sql.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.Api.domain.event.EventRequestDTO;
import com.spring.Api.domain.event.Events;

@Service
public class EventsService {
    public Events createEvent(EventRequestDTO data) {

       String imgURL = null;

       if (data.image() != null) {
        imgURL = this.uploadImg((data.image()));
       } 

       Events newEvents = new Events();
       newEvents.setTitle(data.title());
       newEvents.setDescription(data.description());
       newEvents.setEventUrl(data.eventURL());
       newEvents.setDate(new Date(data.date()));
    }
    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
