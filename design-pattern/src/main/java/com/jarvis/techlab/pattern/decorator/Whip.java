package com.jarvis.techlab.pattern.decorator;
/**
 * 咖啡配料 - 奶泡
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
