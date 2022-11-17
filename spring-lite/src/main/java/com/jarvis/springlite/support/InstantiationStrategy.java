package com.jarvis.springlite.support;

import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 为了解决类带参数的实例化问题。使用策略模式定义该实例化接口
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args)throws BeansException;

}
