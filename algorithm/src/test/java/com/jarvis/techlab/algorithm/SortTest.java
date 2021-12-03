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

}
