package com.jarvis.techlab.algorithm.leetcode;

/**
 * @ClassName Solution917.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2022-02-23 23:22:00
 */
public class Solution917 {
    public String reverseOnlyLetters(String s){
        if(null == s || s.length()==0){
            return s;
        }
        char[] arr = s.toCharArray();
        int right = arr.length-1;
        int left = 0;
        for (; right>0 ; right--) {
            if(right <= left){
                break;
            }
            if(isLetter(arr[right])){
                if(isLetter(arr[left])){
                    swap(left,right,arr);
                    left++;
                }else{
                    left++;
                    right++;
                }
            }
        }
        return new String(arr);
    }

    private boolean isLetter(char word){
        int ascii = word-0;
        if((ascii>64 && ascii < 91) || (ascii>96&& ascii<123)){
            return true;
        }
        return false;
    }

    private void swap(int left,int right,char[] arr){
        char tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
