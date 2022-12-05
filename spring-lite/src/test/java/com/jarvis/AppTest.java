package com.jarvis;

import com.jarvis.bean.UserDao;
import com.jarvis.bean.UserService;
import com.jarvis.common.MyBeanFactoryProcessor;
import com.jarvis.springlite.PropertyValue;
import com.jarvis.springlite.PropertyValues;
import com.jarvis.springlite.config.BeanDefinition;
import com.jarvis.springlite.config.BeanReference;
import com.jarvis.springlite.support.ClassPathXmlApplicationContext;
import com.jarvis.springlite.support.DefaultListableBeanFactory;
import com.jarvis.springlite.support.SimpleInstantiationStrategy;
import com.jarvis.springlite.xml.XmlBeanDefinitionReader;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void getBeanWithNoArgsConstructor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class));
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

    @Test
    public void getBeanWithArgsConstructor(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class));
        UserService userService = (UserService) beanFactory.getBean("userService","jarvis");
        userService.queryUserName();
    }


    @Test
    public void getBeanWithPropertyValue(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfoDB();
    }

    @Test
    void testBeanFactoryPostProcessorAndBeanPostProcessor() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        MyBeanFactoryProcessor beanFactoryProcessor = new MyBeanFactoryProcessor();
        beanFactoryProcessor.postProcessBeanFactory(beanFactory);

        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果: "+ result);
    }

    @Test
    void testXml() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果: "+result);
    }

    @Test
    void testXmlInitDestroy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result =  userService.queryUserInfo();
        System.out.println("测试结果: "+result);
    }

}
