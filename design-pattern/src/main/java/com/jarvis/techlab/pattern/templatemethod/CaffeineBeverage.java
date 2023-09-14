package com.jarvis.techlab.pattern.templatemethod;

/**
 * 模版方法模式
 */
public abstract class CaffeineBeverage {

    /**
     * 该方法为模版方法
     * 封装了制作饮料对算法
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 这里作为一个默认实现的钩子
     * 用作某一个方法的开关
     */
    public Boolean customerWantsCondiments() {
        return true;
    }

}
