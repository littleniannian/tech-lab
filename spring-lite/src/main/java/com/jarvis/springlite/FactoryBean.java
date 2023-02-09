package com.jarvis.springlite;

/**
 * 使得所有实现此接口的对象类都可以扩充自己的对象功能
 * @param <T>
 */
public interface FactoryBean<T> {


    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}
