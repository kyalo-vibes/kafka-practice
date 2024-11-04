package com.kyalo.kafka.consumer;

import com.kyalo.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "kyalo", groupId = "myGroup")
    public void consumeMsg(Student student){
        log.info(String.format("Message is consumed successfully from kyalo topic:: %s", student));

    }
}
