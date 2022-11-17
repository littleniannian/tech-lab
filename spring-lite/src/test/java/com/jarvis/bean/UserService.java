package com.jarvis.bean;

public class UserService {

    private String name;

    public UserService() {
    }

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息");
    }

    public void queryUserName() {
        System.out.println("查询用户名: " + this.name);
    }

}
