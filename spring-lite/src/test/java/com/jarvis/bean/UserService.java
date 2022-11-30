package com.jarvis.bean;

public class UserService {

    private String uId;

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

    public String queryUserInfo() {
       return userDao.queryUserName(uId);
    }

    public void queryUserInfoDB(){
        System.out.println("查询用户信息:"+userDao.queryUserName(uId));
    }

    public void queryUserName() {
        System.out.println("查询用户名: " + this.name);
    }

}
