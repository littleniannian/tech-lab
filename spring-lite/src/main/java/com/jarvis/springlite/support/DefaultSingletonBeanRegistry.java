package com.jarvis.springlite.support;

import com.jarvis.springlite.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 存放实例化的单例Bean
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singleBeanObjects = new HashMap<>(16);

    @Override
    public Object getSingleton(String beanName) {
        return singleBeanObjects.get(beanName);
    }

    @Override
    public Object registerSingleton(String beanName, Object singletonObject) {
        return singleBeanObjects.put(beanName, singletonObject);
    }
}
