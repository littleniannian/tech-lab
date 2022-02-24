package com.jarvis.techlab.algorithm.pattern;

/**
 * @ClassName Singleton.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2021-12-02 23:33:00
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public Singleton getInstance(){
        return SingletonHolder.instance;
    }

}
