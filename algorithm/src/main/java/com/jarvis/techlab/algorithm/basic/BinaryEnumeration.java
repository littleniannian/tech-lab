package com.jarvis.techlab.algorithm.basic;

import java.util.Arrays;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName BinaryEnumeration.java
 * @Description 二进制枚举简单例题
 * @createTime 2022年03月02日 10:30:00
 */
public class BinaryEnumeration {
    //相关博客 https://blog.csdn.net/sugarbliss/article/details/81099340
    // 问题:有五根木棍，长度分别为4,8, 2, 6, 7，遍历出所有的排列组合
    // 分析:每根木根其实都有两种情况取/不取。例如取2 6 7,二进制位是00111,十进制为7。一共有1<<(5)种情况。
    public void solution(){
        int[] requests = new int[]{4,8, 2, 6, 7};
        for(int i=0;i<(1<<requests.length);i++){
            int[] arr = new int[requests.length];
            for (int j = 0; j < 5; j++) {
                arr[j] = ((1<<j)&i)==1?1:0;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
