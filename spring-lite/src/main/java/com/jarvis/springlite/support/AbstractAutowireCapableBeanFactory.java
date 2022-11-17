package com.jarvis.springlite.support;

import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.config.BeanDefinition;

import java.lang.reflect.InvocationTargetException;

/**
 * 实现根据BeanDefinition创建实例的功能
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        try {
            // 这里需要解决带参数类的实例化问题
            Object bean = beanDefinition.getBeanClass().getDeclaredConstructor().newInstance();
            registerSingleton(beanName, bean);
            return bean;
        } catch (InstantiationException |
                 IllegalAccessException |
                 InvocationTargetException |
                 NoSuchMethodException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
    }
}
