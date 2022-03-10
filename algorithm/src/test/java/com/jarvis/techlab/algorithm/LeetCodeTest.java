package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.leetcode.Solution3;
import org.junit.jupiter.api.Test;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName LeetCodeTest.java
 * @createTime 2022年03月08日 10:27:00
 */
public class LeetCodeTest {
    @Test
    public void solution3(){
        Solution3 solution3 = new Solution3();
        //"abba"
        String origin = " ";
        int res = solution3.lengthOfLongestSubstring(origin);
        System.out.println(res);
    }
}
