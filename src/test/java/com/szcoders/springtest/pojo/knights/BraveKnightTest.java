package com.szcoders.springtest.pojo.knights;

import org.junit.Test;


import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        // 用Mockito框架验证Quest的mock实现的embark()方法仅被调用一次
        verify(mockQuest, times(1)).embark();
    }
}
