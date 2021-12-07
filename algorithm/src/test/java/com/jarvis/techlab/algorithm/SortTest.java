package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.sort.BubbleSort;
import com.jarvis.techlab.algorithm.sort.InsertionSort;
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
    public void moveTest(){
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,0};
        Integer sortedIdx = 6;
        Integer unSortedNum = arr[7];

        for (int i = sortedIdx; i >=0 ; i--) {
            arr[i+1] = arr[i];
        }

        arr[0] = unSortedNum;
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void insertionSortTest(){
        int[] arr = new int[]{3,2,1,5,6,7};
        int[] res = InsertionSort.sort(arr);
        System.out.println(Arrays.toString(res));
    }

}
