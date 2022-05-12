package com.jarvis.techlab.newfeature.record;

import org.springframework.util.Assert;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月12日 13:42:00
 */
public class TestClass {

    public static void main(String[] args) {
        PersonRecord personRecord = new PersonRecord("jarvis",25);
        String name = personRecord.name();
        int age = personRecord.age();
        Assert.isTrue(name.equals("jarvis"),"error");
        Assert.isTrue(age==25,"error");
        System.out.println(personRecord.hashCode());
        System.out.println(personRecord);
        PersonRecord.address = "中国";
        Assert.isTrue(PersonRecord.address.equals("中国"),"message");
        PersonRecord.address = "英国";
    }
}
