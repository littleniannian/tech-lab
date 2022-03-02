package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.leetcode.Solution1;
import com.jarvis.techlab.algorithm.leetcode.Solution917;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

    @Test
    public void charTest(){
        char a = 'a';
        char z = 'z';
        char A = 'A';
        char Z = 'Z';
        char w = 91;
        System.out.println(a-0);
        System.out.println(z-0);
        System.out.println(A-0);
        System.out.println(Z-0);
        System.out.println(w);
    }

    @Test
    public void solution917Test(){
        Solution917 solution917 = new Solution917();
        String origin = "a-bC-dEf-ghIj";
        String res = solution917.reverseOnlyLetters(origin);
        Assertions.assertEquals("j-Ih-gfE-dCba",res,"error");
    }


    @Test
    public void solution1Test(){
        Solution1 solution1 = new Solution1();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] res = solution1.twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }

    @Test
    // 挑选出某数所有的位上的1的下标
    public void andTest(){
        // 0111
        // 右移0位 0111
        // 右移1位 011
        // 右移2位 01
        int i = 7;
        for (int j = 0; j < 5; j++) {
            int res = (i>>j);
            System.out.println("val: "+res);
            int idx = res&1;
            System.out.println("flag:"+idx);
        }
    }

    @Test
    public void byteCountTest(){
        int count = Integer.bitCount(7);
        System.out.println(count);
    }
}
