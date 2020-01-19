package com.liuruipeng.springrabiitmqdemo.queue;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {
    /**
     * 创建消息队列
     * @return
     */
    @Bean
    public Queue createQueue(){
        return new Queue("Queue");
    }
    }