package com.lyyang.repository;

import com.lyyang.SpringJdbcProjectApplicationTests;
import com.lyyang.entity.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
class MessageRepositoryTest extends SpringJdbcProjectApplicationTests {

    @Autowired
    MessageRepository messageRepository;

    @Test
    public void messageRepository() {
        messageRepository.save(
                new Message(
                        "caterpillar",
                        1518666769369L,
                        "JavaScript 名稱空間管理 https://openhome.cc/Gossip/ECMAScript/NameSpace.html"
                )
        );

        List<Message> messages = messageRepository.findAll();
        for (Message message : messages) {
            log.info("{}", message);
        }

    }
}