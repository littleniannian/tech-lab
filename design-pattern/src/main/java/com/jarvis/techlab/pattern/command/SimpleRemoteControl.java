package com.jarvis.techlab.pattern.command;

import com.jarvis.techlab.pattern.command.cmd.Command;

public class SimpleRemoteControl {

    private Command command;

    public SimpleRemoteControl(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
