package com.jarvis.springlite;

/**
 * 定义BeanFactory接口,定义获取Bean对象的能力
 */
public interface BeanFactory {

    /**
     * 返回Bean的实例对象
     * @param beanName
     * @return
     */
    Object getBean(String beanName);

    /**
     * 返回含构造参数的Bean对象
     * @param beanName
     * @param args
     * @return
     */
    Object getBean(String beanName, Object... args);


    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
