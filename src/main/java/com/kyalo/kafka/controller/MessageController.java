package com.kyalo.kafka.controller;

import com.kyalo.kafka.payload.Student;
import com.kyalo.kafka.producer.KafkaJsonProducer;
import com.kyalo.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/messages")
public class MessageController {
    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer jsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(
            @RequestBody String msg
    ){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("Message queued successfully");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendJsonMessage(
            @RequestBody Student msg
    ){
        jsonProducer.sendMessage(msg);
        return ResponseEntity.ok("Message queued successfully");
    }
}
