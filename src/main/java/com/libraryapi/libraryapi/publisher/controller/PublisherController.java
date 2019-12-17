package com.libraryapi.libraryapi.publisher.controller;

import com.libraryapi.libraryapi.publisher.model.Publisher;
import com.libraryapi.libraryapi.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/publishers")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping(path = "/{publisherId}")
    public Publisher getPubslisher(@PathVariable("publisherId") String publisherId) {
        return new Publisher(Integer.parseInt(publisherId), "Test", "Test@test.com", "12322");
    }

    @PostMapping
    public ResponseEntity<?> addPublisher(@RequestBody Publisher publisher) {
        return new ResponseEntity<Publisher>(HttpStatus.CREATED, publisherService.addPublisher(publisher));
    }
}
