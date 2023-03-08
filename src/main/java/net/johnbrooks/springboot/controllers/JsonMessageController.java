package net.johnbrooks.springboot.controllers;

import net.johnbrooks.springboot.kafka.JsonKafkaProducer;
import net.johnbrooks.springboot.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private final JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping
    public ResponseEntity<String> publish(@RequestBody User user) {
        this.kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON Message sent to the topic!");
    }
}
