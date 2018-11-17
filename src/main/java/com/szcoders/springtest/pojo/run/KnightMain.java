package com.szcoders.springtest.pojo.run;

import com.szcoders.springtest.pojo.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Spring/knights.xml");
        // 获取Knight bean
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
