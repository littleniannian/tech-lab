package com.jarvis.techlab.pattern.strategy.duck;

import com.jarvis.techlab.pattern.strategy.behavior.FlyBehavior;
import com.jarvis.techlab.pattern.strategy.behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    void performFly(){
        flyBehavior.fly();
    }

    void swim(){}

    void display(){}

    void performQuack(){
        quackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior behavior){
        this.flyBehavior = behavior;
    }

    void setQuackBehavior(QuackBehavior behavior){
        this.quackBehavior = behavior;
    }

}
