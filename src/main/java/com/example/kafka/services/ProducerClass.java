package com.example.kafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerClass {
    private static final Logger logger = LoggerFactory.getLogger(ProducerClass.class);
    private static final String TOPIC = "user";

    @Autowired
    private KafkaTemplate kafkaTemp;

    public void sendMessage(String msg){
        logger.info((String.format("******** Producer sending the message now : %s",msg)));
        this.kafkaTemp.send(TOPIC, msg);
    }
}
