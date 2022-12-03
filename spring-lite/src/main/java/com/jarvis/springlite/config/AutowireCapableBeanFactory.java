package com.jarvis.springlite.config;

import com.jarvis.springlite.BeanFactory;
import com.jarvis.springlite.BeansException;

/**
 * 自动话处理Bean工厂配置的接口，之后逐渐完善
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
