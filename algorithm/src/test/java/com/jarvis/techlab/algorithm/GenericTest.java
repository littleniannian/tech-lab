package com.jarvis.techlab.algorithm;

import org.junit.jupiter.api.Test;

/**
 * @ClassName GenericTest.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2021-11-30 23:25:00
 */
public class GenericTest {

    public void merge(int[] nums1, int m, int[] nums2, int n){
        int temp[] = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j])
                temp[index++] = nums1[i++];
            else
                temp[index++] = nums2[j++];
        }
        for (; i < m; ) {
            temp[index++] = nums1[i++];
        }
        for (; j < n; ) {
            temp[index++] = nums2[j++];
        }
        //再把数组temp中的值赋给nums1
        for (int k = 0; k < m + n; k++) {
            nums1[k] = temp[k];
        }
    }

    @Test
    public void mergeTest(){
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = {1,2,3,0,0,0};
        int m=3,n=3;
        int[] nums2 = {2,5,6};
        merge(nums1,m,nums2,n);
    }

    public static int fibonacciHandler(int n){
        final int mod = 1000000007;
        if(n<2){
            return n;
        }
        int p=0,q=0,r=1;
        for(int i=2;i<=n;i++){
            p=q;
            q=r;
            r = (p+q)%mod;
        }
        return r;
    }
    @Test
    public void fibonacciHanlderTest(){
        //[0 1 1 2 3 5 8 13 ......]
        int res = fibonacciHandler(5);
        System.out.println(res);
    }
}
