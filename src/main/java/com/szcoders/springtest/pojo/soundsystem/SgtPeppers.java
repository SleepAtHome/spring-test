package com.szcoders.springtest.pojo.soundsystem;

import org.springframework.stereotype.Component;

// 自定义bean id：@Component("xxx")
// 告知Spring创建Bean
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing : "+title+" by "+artist);
    }
}

// 这里这个SgtPeppers可以理解是一个光碟的一个名称