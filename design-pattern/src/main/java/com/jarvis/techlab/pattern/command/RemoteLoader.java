package com.jarvis.techlab.pattern.command;

import com.jarvis.techlab.pattern.command.cmd.GarageOnCommand;
import com.jarvis.techlab.pattern.command.cmd.LightOnCommand;
import com.jarvis.techlab.pattern.command.cmd.NoCommand;
import com.jarvis.techlab.pattern.command.cmd.StereoOnWithCDCommand;
import com.jarvis.techlab.pattern.command.entity.GarageDoor;
import com.jarvis.techlab.pattern.command.entity.Light;
import com.jarvis.techlab.pattern.command.entity.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        GarageOnCommand garageOnCommand = new GarageOnCommand(garageDoor);
        NoCommand noCommand = new NoCommand();
        remoteControl.setCommands(0, lightOnCommand, noCommand);
        remoteControl.setCommands(1, stereoOnWithCDCommand, noCommand);
        remoteControl.setCommands(2, garageOnCommand, noCommand);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
    }
}
