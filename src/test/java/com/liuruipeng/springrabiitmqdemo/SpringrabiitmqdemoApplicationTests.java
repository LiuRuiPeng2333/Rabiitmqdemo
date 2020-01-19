package com.liuruipeng.springrabiitmqdemo;

import com.liuruipeng.springrabiitmqdemo.queue.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringrabiitmqdemoApplicationTests {
    @Autowired
    private Sender sender;
    @Test
    void contextLoads() {
        this.sender.send("Hello RabbitMQ");
    }

}
