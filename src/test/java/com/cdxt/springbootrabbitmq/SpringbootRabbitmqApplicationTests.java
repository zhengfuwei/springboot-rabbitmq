package com.cdxt.springbootrabbitmq;

import com.cdxt.springbootrabbitmq.producer.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRabbitmqApplicationTests {

    @Autowired
    private MsgProducer msgProducer;
    @Test
    public void contextLoads() {
        List list = new ArrayList<>();
        list.add("123");
        list.add("1234");
        list.forEach(a ->{
            System.out.println(a.toString());
        });
        msgProducer.sendMsg("hello rabbitMQ!"+list);
    }

}
