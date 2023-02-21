package com.jarvis.techlab.pattern.adaptor;

/**
 * 使用场景: 住酒店，使用中式的插头，
 * 需要一个实现中式插头接口的转换器
 */
public class TurkeyAdaptor implements Duck{

    private Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
