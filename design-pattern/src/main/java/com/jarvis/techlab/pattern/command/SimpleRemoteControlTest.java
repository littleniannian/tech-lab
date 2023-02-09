package com.jarvis.techlab.pattern.command;

import com.jarvis.techlab.pattern.command.cmd.GarageOnCommand;
import com.jarvis.techlab.pattern.command.cmd.LightOnCommand;
import com.jarvis.techlab.pattern.command.entity.GarageDoor;
import com.jarvis.techlab.pattern.command.entity.Light;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(lightOnCommand);
        remoteControl.buttonWasPressed();
        GarageDoor garageDoor = new GarageDoor();
        GarageOnCommand garageOnCommand = new GarageOnCommand(garageDoor);
        remoteControl.setCommand(garageOnCommand);
        remoteControl.buttonWasPressed();
    }

}
