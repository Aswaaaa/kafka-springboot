package edstem.kafkaspringboot.kafka;

import edstem.kafkaspringboot.payload.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
public class JsonKafkaConsumer {

    @KafkaListener(topics = "aswa", groupId = "myGroup")
    public void consume(User user) {
        log.info("Json message received -> {}", user);
    }
}
