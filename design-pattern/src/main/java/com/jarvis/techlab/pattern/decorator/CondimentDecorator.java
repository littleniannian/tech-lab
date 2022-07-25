package com.jarvis.techlab.pattern.decorator;

/**
 * 咖啡配料类
 */
public abstract class CondimentDecorator extends Beverage{

    /**
     * 这里使用组合，将饮料类型组合进入配料中
     */
    Beverage beverage;

    public abstract String getDescription();


}
