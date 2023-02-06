package com.jarvis.techlab.pattern.singleton;

/**
 * 巧克力锅炉-简单单例模式
 */
public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = false;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }


}
