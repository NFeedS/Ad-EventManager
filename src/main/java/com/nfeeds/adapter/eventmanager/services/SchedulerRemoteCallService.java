package com.nfeeds.adapter.eventmanager.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SchedulerRemoteCallService {

    @Value("${nfeeds.pl.scheduler.url}")
    private String baseUrl;
}
