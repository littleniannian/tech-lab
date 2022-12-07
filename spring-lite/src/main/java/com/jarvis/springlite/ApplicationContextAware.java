package com.jarvis.springlite;

import com.jarvis.springlite.context.ApplicationContext;

public interface ApplicationContextAware extends Aware{

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
