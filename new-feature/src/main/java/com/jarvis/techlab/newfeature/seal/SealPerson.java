package com.jarvis.techlab.newfeature.seal;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * sealed关键字可以用在class,interfaces上，然后使用permits关键字指定类进行扩展和实现
 * @createTime 2022年05月12日 14:08:00
 */
public sealed class SealPerson permits SealTeacher,SealStudent,SealWorker{

}
