package com.szcoders.springtest.pojo.knights;

public class RescueDamselQuestKnight implements Knight {
    private RescueDamselQuest quest;

    // 与RescueDamselQuest紧耦合（只能执行这个任务）
    public RescueDamselQuestKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
