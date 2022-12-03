package com.jarvis.common;

import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.ConfigurableListableBeanFactory;
import com.jarvis.springlite.PropertyValue;
import com.jarvis.springlite.PropertyValues;
import com.jarvis.springlite.config.BeanDefinition;
import com.jarvis.springlite.config.BeanFactoryPostProcessor;

public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "改为字节跳动"));
    }
}
