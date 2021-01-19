package com.app.simpe.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/event")
public class KafkaProducerResource {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @GetMapping(value = "/publish")
    public void test(@RequestParam(name = "message") String message) {
        kafkaTemplate.send("test-topic", message);
    }
}
