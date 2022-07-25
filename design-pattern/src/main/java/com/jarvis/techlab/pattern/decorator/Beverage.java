package com.jarvis.techlab.pattern.decorator;

/**
 * 星巴滋咖啡 饮品抽象类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
