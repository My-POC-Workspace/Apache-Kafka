package com.kafka.controller;

import com.kafka.entity.User;
import com.kafka.kafka.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/json-publish")
    public ResponseEntity<String> jsonPublish(@RequestBody User user){
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("User sent successfully...");
    }

}
