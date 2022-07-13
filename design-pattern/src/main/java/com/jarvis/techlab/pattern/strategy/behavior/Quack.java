package com.jarvis.techlab.pattern.strategy.behavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }
}
