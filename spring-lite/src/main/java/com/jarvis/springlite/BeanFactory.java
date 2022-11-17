package com.jarvis.springlite;

/**
 * 定义BeanFactory接口,定义获取Bean对象的能力
 */
public interface BeanFactory {
    Object getBean(String beanName);
}
