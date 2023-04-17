package com.nfeeds.adapter.eventmanager.controller;

import com.nfeeds.adapter.eventmanager.services.EventManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/eventmanager")
public class EventManagerController {

    private final EventManagerService eventManagerService;

    public EventManagerController(EventManagerService eventManagerService) {
        this.eventManagerService = eventManagerService;
    }
}
