package com.jarvis.techlab.pattern.factory.simple;

import com.jarvis.techlab.pattern.factory.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }

}
