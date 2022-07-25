package com.jarvis.techlab.pattern.decorator;

/**
 * 咖啡制作类型 - 深度烘焙
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
