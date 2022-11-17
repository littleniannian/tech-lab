package com.jarvis.techlab.algorithm.basic.binary;

public class BinaryOperator {

    /**
     * 奇数最后一位数字一定是1
     * @param num
     * @return
     */
    public static Boolean isOdd(Integer num){
        return (num & 1) == 1;
    }



}
