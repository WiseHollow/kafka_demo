package net.johnbrooks.springboot.kafka;

import net.johnbrooks.springboot.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = { "USER_TOPIC" }, groupId = "myGroup")
    public void consume(User message) {
        LOGGER.info(String.format("Received \"%s\"", message));
    }
}
