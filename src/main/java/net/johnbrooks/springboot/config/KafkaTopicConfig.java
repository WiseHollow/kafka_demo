package net.johnbrooks.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic demoTopic() {
        return TopicBuilder
                .name("DEMO_TOPIC")
                .build();
    }

    @Bean
    public NewTopic userTopic() {
        return TopicBuilder
                .name("USER_TOPIC")
                .build();
    }
}
