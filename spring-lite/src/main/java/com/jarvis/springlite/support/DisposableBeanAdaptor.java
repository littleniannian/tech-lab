package com.jarvis.springlite.support;

import cn.hutool.core.util.StrUtil;
import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.DisposableBean;
import com.jarvis.springlite.config.BeanDefinition;

import java.lang.reflect.Method;

public class DisposableBeanAdaptor implements DisposableBean {

    private final Object bean;

    private final String beanName;

    private String destroyMethodName;

    public DisposableBeanAdaptor(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this. destroyMethodName = beanDefinition.getDestroyMethodName();
    }

    @Override
    public void destroy() throws Exception {
        // 1. 实现了DisposableBeanAdaptor
        if(bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }
        // 2. 配置信息destroy-method。为了避免既实现了Disposable接口，也进行了destroy-method的配置，导致二次执行销毁方法。
        if(StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))){
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if(null == destroyMethod){
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }
    }
}
