package com.jarvis.techlab.algorithm.pattern.struct.adapter;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName TurkeyAdapter.java
 * @createTime 2022年02月24日 15:22:00
 */
public class TurkeyAdapter implements Duck{

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
