package com.nfeeds.adapter.eventmanager.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ContentManagerRemoteCallService {

    @Value("${nfeeds.ad.contentmanager.url}")
    private String baseUrl;
}
