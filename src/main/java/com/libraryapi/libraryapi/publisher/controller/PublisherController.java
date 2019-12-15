package com.libraryapi.libraryapi.publisher.controller;

import com.libraryapi.libraryapi.publisher.model.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(path = "/v1/publishers")
public class PublisherController {

    @GetMapping(path = "/{publisherId}")
    public Publisher getPubslisher(@PathVariable("publisherId") String publisherId)
    {
        return new Publisher(Integer.parseInt(publisherId),"Test","Test@test.com","12322");
    }
}
