package com.szcoders.springtest.pojo.knights;

import java.io.PrintStream;

/**
 * 吟游诗人类，用于记录Knight的事迹，用于学习SpringAOP
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    // 探险之前调用
    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave...");
    }

    // 探险之后调用
    public void singAfterQuest() {
        System.out.println("Tee hee hee,knight finished the quest..");
    }
}
