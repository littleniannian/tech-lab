package com.jarvis.springlite.support;

import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.core.io.Resource;
import com.jarvis.springlite.core.io.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
