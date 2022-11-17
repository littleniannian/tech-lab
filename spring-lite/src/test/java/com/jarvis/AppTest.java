package com.jarvis;

import com.jarvis.bean.UserService;
import com.jarvis.springlite.config.BeanDefinition;
import com.jarvis.springlite.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class));
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
