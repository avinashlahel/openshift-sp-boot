package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(path = "/")
    public ResponseEntity getMessage() {
        return ResponseEntity.ok("Hello from the other side");
    }
}
