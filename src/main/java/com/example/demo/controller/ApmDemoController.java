package com.example.demo.controller;

import com.example.demo.service.ApmDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApmDemoController {

    @Autowired
    private ApmDemoService apmDemoService;

    @GetMapping("/apm/{id}")
    public ResponseEntity<String> apmString(@PathVariable String id) {
        String info = apmDemoService.findApmById(id);
        return new ResponseEntity<>(info, HttpStatus.OK);
    }
}
