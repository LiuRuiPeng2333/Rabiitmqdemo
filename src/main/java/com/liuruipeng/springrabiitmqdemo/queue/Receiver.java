package com.liuruipeng.springrabiitmqdemo.queue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*
 消息接受者
 */
@Component
@Slf4j
public class Receiver {

    /**
     * 接收消息的方法，采用消息队列监听机制
     * @param msg
     */
    @RabbitListener(queues = "Queue")
    public  void process(String msg){

        log.info("receiver:"+msg);
    }

}
