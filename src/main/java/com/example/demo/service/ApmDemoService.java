package com.example.demo.service;

import com.example.demo.entity.ApmInstance;
import com.example.demo.repository.ApmDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ApmDemoService {

    @Autowired
    private ApmDemoRepository apmDemoRepository;
    @Autowired
    private RestTemplate restTemplate;

    public String findApmById(final String id) {
        ApmInstance apmInstance = apmDemoRepository.findById(id).get();
        System.out.println(apmInstance.getUrl());
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(apmInstance.getUrl(), HttpMethod.GET, entity, String.class).getBody();

    }

}
