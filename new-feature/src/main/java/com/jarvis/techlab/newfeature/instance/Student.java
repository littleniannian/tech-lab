package com.jarvis.techlab.newfeature.instance;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月12日 13:11:00
 */
public class Student implements Person{
    private String name;

    @Override
    public void say() {
        System.out.println("I am a Student");
    }
}
