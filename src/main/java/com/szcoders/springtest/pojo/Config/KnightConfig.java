package com.szcoders.springtest.pojo.Config;

import com.szcoders.springtest.pojo.knights.BraveKnight;
import com.szcoders.springtest.pojo.knights.Knight;
import com.szcoders.springtest.pojo.knights.Quest;
import com.szcoders.springtest.pojo.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 表示这是一个bean配置类
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    private Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
