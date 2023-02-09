package com.jarvis.techlab.pattern.command.cmd;

import com.jarvis.techlab.pattern.command.entity.CeilingFan;

public class CellingFanHighCommand implements Command{

    private CeilingFan ceilingFan;

    private int preSpeed;

    public CellingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }else if(preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }else if(preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
