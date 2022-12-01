package com.jarvis.springlite.config;

import com.jarvis.springlite.HierarchicalBeanFactory;

/**
 * 用于获取BeanPostProcessor,BeanClassLoader等方法的配置化接口
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
