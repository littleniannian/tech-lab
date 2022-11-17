package com.jarvis.springlite.config;

/**
 * 定义单例对象操作接口
 */
public interface SingletonBeanRegistry {

    /**
     * 这里感觉有点奇怪，既然这个接口叫registry但是却有getSingleton的功能
     * getSingleton功能应该是factory对象的
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    Object registerSingleton(String beanName, Object singletonObject);

}
