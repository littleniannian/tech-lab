package com.jarvis.techlab.algorithm.leetcode;

/**
 * @ClassName Solution1601.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2022-03-01 23:53:00
 */
public class Solution1601 {
    public int maximumRequests(int n,int[][] requests){
        int res = 0;
        for(int i=0;i<1<<requests.length;i++){
            // 这里的byteCount就是等于某方案中选中的请求个数
            int byteCount = Integer.bitCount(i);
            if(byteCount<res){
                continue;
            }
            if(check(i,n,requests)){
                res = byteCount;
            }

        }
        return res;
    }

    /**
     *
     * @param i 方案的值
     * @param size 楼的数量
     * @return
     */
    private boolean check(int i,int size,int[][] requests){
        // 这个是楼的结果集
        int[] flagArr = new int[size];
        for(int j=0;j<requests.length;j++){
            // ((i>>j)&1) *含义:将数字i右移j位，再与1进行和运算，判断该位的数字是否是1
            if(((i>>j)&1)==1){
                flagArr[requests[j][0]]--;
                flagArr[requests[j][1]]++;
            }
        }
        for (int flagCount: flagArr) {
            if(flagCount!=0){
                return false;
            }
        }
        return true;
    }
}
