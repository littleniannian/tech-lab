package com.jarvis.springlite.support;

import com.jarvis.springlite.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
