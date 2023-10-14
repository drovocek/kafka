package edu.soft.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = {"topic1", "topic2"}, groupId = "1")
    public void listenGroupFoo(String message) {
        System.out.println("get message: " + message);
    }
}
