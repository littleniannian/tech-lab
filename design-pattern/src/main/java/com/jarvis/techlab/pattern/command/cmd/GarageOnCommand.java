package com.jarvis.techlab.pattern.command.cmd;

import com.jarvis.techlab.pattern.command.entity.GarageDoor;

public class GarageOnCommand implements Command{

    private GarageDoor garageDoor;

    public GarageOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
    }
}
