package com.jarvis.techlab.pattern.strategy.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}
