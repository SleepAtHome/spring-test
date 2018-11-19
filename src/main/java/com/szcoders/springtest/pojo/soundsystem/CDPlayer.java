package com.szcoders.springtest.pojo.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    // @Autowired 可以用在构造方法上，
    // 想要Spring对这个bean不进行null检查的话，可以@Autowired(required = false)
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }

    // @Autowired 也可以用在属性的setter方法上
    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }


    @Override
    public void play() {
        cd.play();
    }
}
