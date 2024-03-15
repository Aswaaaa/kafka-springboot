package edstem.kafkaspringboot.kafka;

import edstem.kafkaspringboot.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "aswa", groupId = "myGroup")
    public void consumeJsonMessage(User message) {
        log.info("Message received -> {}", message);
    }
}
