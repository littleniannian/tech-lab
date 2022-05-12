package com.jarvis.techlab.newfeature.record;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * JDK16新特性
 * 拥有一个构造方法
 * 获取成员属性的方法 name()、age()
 * hashCode()方法和equals()方法
 * toString()方法
 * 类对象和属性被final关键字修饰，不能被继承，类的示例属性也都被final修饰
 * 其实就是一个只读的数据载体类
 * @createTime 2022年05月12日 13:24:00
 */
public record PersonRecord(String name, int age) {

    public static String address;
}
