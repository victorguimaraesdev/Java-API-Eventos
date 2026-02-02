package com.spring.Api.domain.event;

import org.springframework.web.multipart.MultipartFile;

public record EventsRequestDTO(String title, String description, Long date, String city, String state, Boolean remote, String eventURL, MultipartFile image) {

}
    

