package com.spring.Api.services;



import java.sql.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.Api.domain.event.EventsRequestDTO;
import com.spring.Api.domain.event.Events;

@Service
public class EventsService {
    public Events createEvent(EventsRequestDTO data) {

       String imgURL = null;

       if (data.image() != null) {
        imgURL = this.uploadImg((data.image()));
       } 

       Events newEvent = new Events();
       newEvent.setTitle(data.title());
       newEvent.setDescription(data.description());
       newEvent.setEventUrl(data.eventURL());
       newEvent.setDate(new Date(data.date()));
       newEvent.setImgUrl(imgURL);

       return newEvent;
    }
    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
