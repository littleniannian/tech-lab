package com.jarvis.techlab.pattern.strategy.behavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }

}
