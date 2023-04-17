package com.nfeeds.adapter.eventmanager.services;

import org.springframework.stereotype.Service;

@Service
public class EventManagerService {

    private final ContentManagerRemoteCallService contentManagerRemoteCallService;
    private final SchedulerRemoteCallService schedulerRemoteCallService;

    public EventManagerService(ContentManagerRemoteCallService contentManagerRemoteCallService, SchedulerRemoteCallService schedulerRemoteCallService) {
        this.contentManagerRemoteCallService = contentManagerRemoteCallService;
        this.schedulerRemoteCallService = schedulerRemoteCallService;
    }
}
