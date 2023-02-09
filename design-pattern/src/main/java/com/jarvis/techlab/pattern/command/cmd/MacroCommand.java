package com.jarvis.techlab.pattern.command.cmd;

/**
 * 宏命令, 执行一堆命令的集合
 */
public class MacroCommand implements Command{

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
