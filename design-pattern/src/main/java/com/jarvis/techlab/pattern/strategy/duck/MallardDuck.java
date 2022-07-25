package com.jarvis.techlab.pattern.strategy.duck;

import com.jarvis.techlab.pattern.strategy.behavior.FlyNoWay;
import com.jarvis.techlab.pattern.strategy.behavior.FlyWithWings;
import com.jarvis.techlab.pattern.strategy.behavior.Quack;

/**
 * 这里策略模式就是把，行为独立出来。组合进客户类的超类。
 * 但是，具体行为的确定由父类的子类决定。
 */
public class MallardDuck extends Duck{


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void performFly() {
        super.performFly();
    }

    @Override
    void swim() {
        super.swim();
    }

    @Override
    void performQuack() {
        super.performQuack();
    }

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }

}
