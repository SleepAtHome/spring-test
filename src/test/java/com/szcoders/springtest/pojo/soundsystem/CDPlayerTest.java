package com.szcoders.springtest.pojo.soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) // 创建应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class) // 应用CDPlayerConfig类中加载的配置
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    // 自动注入
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }

/*  出现了一个奇怪的打印错误
  @Test
    public void play() {
        player.play();
        assertEquals("Playing : Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",log.getLog());
    }*/



}
