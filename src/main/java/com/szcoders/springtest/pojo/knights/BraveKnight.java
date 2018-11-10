package com.szcoders.springtest.pojo.knights;

public class BraveKnight implements Knight {
    private Quest quest;

    // Quest被注入进来（能执行任何任务，取决于注入进来的是什么）
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
