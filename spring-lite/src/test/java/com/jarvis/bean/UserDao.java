package com.jarvis.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行： init-method");
        hashMap.put("10001", "jarvis");
        hashMap.put("10002", "jarvis1");
        hashMap.put("10003", "jarvis2");
    }

    public void destroyMethod() {
        System.out.println("执行: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
