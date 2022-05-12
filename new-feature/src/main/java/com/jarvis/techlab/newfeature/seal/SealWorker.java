package com.jarvis.techlab.newfeature.seal;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * 子类可以用sealed修饰
 * @createTime 2022年05月12日 14:08:00
 */
sealed public class SealWorker extends SealPerson permits MiddleWorker,SeniorWorker{
}
