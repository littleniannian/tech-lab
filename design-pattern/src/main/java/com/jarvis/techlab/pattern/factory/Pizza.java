package com.jarvis.techlab.pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里使用Pizza作为案例
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String source;
    List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough ... ");
        System.out.println("Adding source ... ");
        System.out.println("Adding toppings ... ");
        toppings.forEach(System.out::println);
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
