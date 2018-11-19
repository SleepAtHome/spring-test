package com.szcoders.springtest.pojo.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// 自定义bean id：@Component("xxx")
// 告知Spring创建Bean
@Component
public class WhiteAlbum implements CompactDisc {
    private String title = "WhiteAlbum";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing : "+title+" by "+artist);
    }

    // 想要自定义Bean的命名可以用@Bean(name = "xxx")
    @Bean
    public CompactDisc sgtPeppers() {
        return new WhiteAlbum();
    }

}

// 这里这个SgtPeppers可以理解是一个光碟的一个名称