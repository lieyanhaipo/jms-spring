package com.lb.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author libing
 * @desc
 * @date 2017/12/11 17:58
 */
public class AppProducer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            service.sendMessage("test"+i);
        }
        context.close();
    }
}
