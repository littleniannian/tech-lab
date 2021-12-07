package com.jarvis.techlab.algorithm.sort;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName BubbleSort.java
 * @createTime 2021年11月29日 12:39:00
 */
public class BubbleSort {

    public static Integer[] sort(Integer[] arr){
        for (int i= 0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
        return arr;
    }

    public static void swap(Integer i,Integer j,Integer[] arr){
        Integer temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
