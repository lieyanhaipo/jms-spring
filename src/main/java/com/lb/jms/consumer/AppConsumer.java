package com.lb.jms.consumer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author libing
 * @desc
 * @date 2017/12/11 18:52
 */
public class AppConsumer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }
}
