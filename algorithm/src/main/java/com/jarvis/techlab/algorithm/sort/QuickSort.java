package com.jarvis.techlab.algorithm.sort;

/**
 * @ClassName QuickSort.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2021-12-06 23:24:00
 */
public class QuickSort {

    public static void sort(int[] arr,int l,int r){
        if(l<r){
            int flag = arr[l];
            int i = l;
            int j = r;
            while (i<j){
                while(i<j && flag <= arr[j] ){
                    j--;
                }
                if(i<j){
                    arr[i++] = arr[j];
                }

                while (i<j && flag >= arr[i]){
                    i++;
                }
                if(i<j){
                    arr[j++] = arr[i];
                }
            }
            arr[i] = flag;
            sort(arr,l,i-1);
            sort(arr,i+1,r);
        }
    }

}
