package com.jarvis.techlab.pattern.decorator;

/**
 * 咖啡制作类型 - 家庭综合
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
