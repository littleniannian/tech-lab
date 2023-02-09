package com.jarvis.techlab.pattern.command.cmd;

import com.jarvis.techlab.pattern.command.entity.Light;

public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
