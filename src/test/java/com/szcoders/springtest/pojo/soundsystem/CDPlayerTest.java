package com.szcoders.springtest.pojo.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) // 创建应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class) // 应用CDPlayerConfig类中加载的配置
public class CDPlayerTest {
    // 自动注入
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull() {
        assertNotNull(cd);
    }
}
