package com.jarvis.techlab.pattern.factory.method;

import com.jarvis.techlab.pattern.factory.Pizza;

/**
 * 这里其实不是客户类类而是 抽象工厂类
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 这个方法就是工厂方法模式的核心，将具体的创建过程延迟给子类决定，
     * orderPizza方法在子类创建之前是不知道，会创建何种类型的对象的。
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
