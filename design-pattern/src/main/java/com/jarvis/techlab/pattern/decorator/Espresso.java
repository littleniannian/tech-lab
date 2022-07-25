package com.jarvis.techlab.pattern.decorator;

/**
 * 咖啡制作类型 - 浓缩咖啡
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
