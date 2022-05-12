package com.jarvis.techlab.newfeature.random;

import java.util.random.RandomGenerator;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * JDK17曾倩的伪随机数生成器
 * 可以自己选择伪随机算法
 * @createTime 2022年05月12日 14:29:00
 */
public class RandomTestClass {
    public static void genRandom(){
        RandomGenerator generator = RandomGenerator.of("L64X128MixRandom");
        Integer res = generator.nextInt();
        System.out.println(res);
    }

    public static void main(String[] args) {
        RandomTestClass.genRandom();
    }
}
