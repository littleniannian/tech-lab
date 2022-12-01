package com.jarvis.springlite.config;

import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    /**
     * 在所有的BeanDefinition加载完成后，且将Bean对象实例化之前，提供修改BeanDefinition属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
