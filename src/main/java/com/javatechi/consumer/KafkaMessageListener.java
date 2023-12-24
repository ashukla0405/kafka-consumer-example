package com.javatechi.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaMessageListener {
   Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
   @KafkaListener(topics = "javatechi-common",groupId ="jt-group-common" )
   public void consume1(String message){
       log.info("Consumer1 consume the messages{}" , message);
   }
    @KafkaListener(topics = "javatechi-common",groupId ="jt-group-common" )
    public void consume2(String message){
        log.info("Consumer2 consume the messages{}" , message);
    }
    @KafkaListener(topics = "javatechi-common",groupId ="jt-group-common" )
    public void consume3(String message){
        log.info("Consumer3 consume the messages{}" , message);
    }
    @KafkaListener(topics = "javatechi-common",groupId ="jt-group-common" )
    public void consume4(String message){
        log.info("Consumer4 consume the messages{}" , message);
    }
}
