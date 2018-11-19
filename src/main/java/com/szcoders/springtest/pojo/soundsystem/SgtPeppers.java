package com.szcoders.springtest.pojo.soundsystem;

import org.springframework.context.annotation.Bean;
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

    // 想要自定义Bean的命名可以用@Bean(name = "xxx")
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    // 在一组CD中随机选择一个CD来播放
    public CompactDisc rendomBeatlesCD() {
        int choice = (int) (Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        }else if (choice == 1) {
            return new WhiteAlbum();
        }else {
            // ...
        }
        return new SgtPeppers();// 随便返回一个
    }

    /*@Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(sgtPeppers());
    }*/

    // 自动注入Bean的Bean
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}

// 这里这个SgtPeppers可以理解是一个光碟的一个名称