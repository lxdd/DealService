package cn.com.eju.deal.common.jms.rabbitmq.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitmqService implements MessageListener
{
    public void onMessage(Message message)
    {
        System.out.println("消息消费者 = " + message.toString());
    }
}