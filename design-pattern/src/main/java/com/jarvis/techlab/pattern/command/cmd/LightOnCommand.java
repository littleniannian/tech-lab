package com.jarvis.techlab.pattern.command.cmd;

import com.jarvis.techlab.pattern.command.entity.Light;

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
