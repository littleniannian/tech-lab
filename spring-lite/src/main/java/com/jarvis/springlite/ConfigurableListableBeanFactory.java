package com.jarvis.springlite;

import com.jarvis.springlite.config.AutowireCapableBeanFactory;
import com.jarvis.springlite.config.BeanDefinition;
import com.jarvis.springlite.config.ConfigurableBeanFactory;

/**
 * 提供分析和修改Bean对象与预先实例化的接口
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons()throws BeansException;

}
