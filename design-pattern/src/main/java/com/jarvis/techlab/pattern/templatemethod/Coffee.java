package com.jarvis.techlab.pattern.templatemethod;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public Boolean customerWantsCondiments() {
        return false;
    }
}
