package com.jarvis.techlab.algorithm.sort;

/**
 * @ClassName InsertSort.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2021-12-07 22:05:00
 */
public class InsertionSort {

    public static int[] sort(int[] arr){
        int sortedEndIdx = 0;
        for(int i=1;i<arr.length;i++){
            // 取出未排序的数
            int unSortedNum = arr[i];
            // 将未排序的数插入到正确的位置
            for(int j=0;j<=sortedEndIdx;j++){
                // 未排序的数小于排序好的数
                if(unSortedNum<arr[j]){
                    // 从j位置上的数都往后移动一位，j位置让给unSortedNum
                    for(int k=sortedEndIdx;k>=j;k--){
                        arr[k+1] = arr[k];
                    }
                    arr[j] = unSortedNum;
                }
                sortedEndIdx++;
                // 该循环只要给未排序的数找到位置就break
                break;
            }
        }
        return arr;
    }
}
