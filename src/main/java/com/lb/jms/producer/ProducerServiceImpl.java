package com.lb.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @author libing
 * @desc
 * @date 2017/12/11 17:36
 */
public class ProducerServiceImpl  implements ProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;

    //队列模式
    //@Resource(name="queueDestination")
    //主题模式
    @Resource(name="topicDestination")
    private Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplate发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            //创建消息
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息:"+message);
    }
}
