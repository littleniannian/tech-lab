package com.jarvis.techlab.pattern.factory.simple;

import com.jarvis.techlab.pattern.factory.Pizza;

/**
 * 使用工厂创建对象的客户类
 * 这里是披萨店
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }
}
