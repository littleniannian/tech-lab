package com.jarvis.techlab.pattern.command.cmd;

/**
 * 这是命令模式的核心抽象
 */
public interface Command {

    void execute();

    void undo();

}
