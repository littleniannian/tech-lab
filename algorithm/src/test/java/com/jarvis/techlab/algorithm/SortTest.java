package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName SortTest.java
 * @createTime 2021年11月29日 12:46:00
 */
public class SortTest {

    @Test
    public void bubbleTest(){
        Integer[] arr = new Integer[]{3,2,1,5,6,7};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void charTest(){
        char a = 'a';
        char z = 'z';
        System.out.println(a-0);
        System.out.println(z-0);
        char A = 'A';
        char Z = 'Z';
        System.out.println(A-0);
        System.out.println(Z-0);
        char b = '-';
        System.out.println(b-0);
    }


    // 使用双指针可以一次循环解决该问题
    public String reverseOnlyLetters(String s) {
        if(null == s || s.length() == 0){
            return s;
        }
        char[] arr = s.toCharArray();
        int right = s.length()-1;
        int left = 0;
        for(;right<arr.length;right--){
            if(right==left){
                break;
            }
            if(isLetter(arr[right])){
                if(isLetter(arr[left])){
                    swap(left,right,arr);
                    left++;
                }else{
                    left++;
                }
            }
        }
        return new String(arr);
    }

    private boolean isLetter(char letter){
        int letterNum = letter-'0';
        if(letterNum>64 && letterNum<123){
            return true;
        }
        return false;
    }

    private void swap(int leftIdx,int rightIdx,char[] arr){
        char temp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = temp;
    }

    @Test
    public void reverseOnlyLettersTest(){

    }

}
