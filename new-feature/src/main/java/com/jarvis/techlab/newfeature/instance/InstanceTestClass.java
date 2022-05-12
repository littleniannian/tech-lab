package com.jarvis.techlab.newfeature.instance;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月12日 13:11:00
 */
public class InstanceTestClass {

    public void instanceTest(){
        Person person = new Student();

        if(person instanceof Student student){
            student.say();
        }else if(person instanceof Teacher teacher){
            teacher.say();
        }
    }
}
