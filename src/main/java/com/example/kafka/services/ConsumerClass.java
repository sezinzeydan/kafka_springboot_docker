package com.example.kafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {
    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);

    @KafkaListener(topics = "user", groupId = "foo")
    public void consume(String msg){
        logger.info(String.format("****** Consumer received : %s",msg));
    }

}
