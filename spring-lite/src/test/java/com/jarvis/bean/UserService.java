package com.jarvis.bean;

import com.jarvis.springlite.ApplicationContextAware;
import com.jarvis.springlite.BeanClassLoaderAware;
import com.jarvis.springlite.BeanFactory;
import com.jarvis.springlite.BeanFactoryAware;
import com.jarvis.springlite.BeanNameAware;
import com.jarvis.springlite.BeansException;
import com.jarvis.springlite.DisposableBean;
import com.jarvis.springlite.InitializingBean;
import com.jarvis.springlite.context.ApplicationContext;

public class UserService implements InitializingBean, DisposableBean, BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {


    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;

    private String uId;

    private String company;

    private String location;

    private String name;

    private UserDao userDao;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + company + location;
    }

    public void queryUserInfoDB() {
        System.out.println("查询用户信息:" + userDao.queryUserName(uId));
    }

    public void queryUserName() {
        System.out.println("查询用户名: " + this.name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行: UserService.afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader: "+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is : "+ name);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
