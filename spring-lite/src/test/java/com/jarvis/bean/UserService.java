package com.jarvis.bean;

import com.jarvis.springlite.DisposableBean;
import com.jarvis.springlite.InitializingBean;

public class UserService implements InitializingBean, DisposableBean {

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

    public void queryUserInfoDB(){
        System.out.println("查询用户信息:"+userDao.queryUserName(uId));
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
}
