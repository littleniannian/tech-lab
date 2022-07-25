package com.jarvis.techlab.pattern.decorator;

/**
 * 这里我认为，咖啡制作是一个典型的例子。
 * 外部装饰者一层层包裹，不断调用被包裹的类型的方法，就像咖啡的配料可以不断的装饰在咖啡上
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $ "+beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" +beverage2.cost());

    }

}
