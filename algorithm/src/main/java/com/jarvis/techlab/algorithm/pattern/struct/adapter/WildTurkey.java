package com.jarvis.techlab.algorithm.pattern.struct.adapter;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName WildTurkey.java
 * @createTime 2022年02月24日 15:20:00
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("gobble！！！！！！");
    }
}
