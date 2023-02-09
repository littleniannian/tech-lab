package com.jarvis.techlab.pattern.command.cmd;

/**
 * 相当于默认值
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
