package com.jarvis.techlab.pattern.templatemethod;

public class Test {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Tea();
        coffee.prepareRecipe();
    }

}
