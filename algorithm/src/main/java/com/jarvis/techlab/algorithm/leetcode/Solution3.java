package com.jarvis.techlab.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName Solution3.java
 * @createTime 2022年03月08日 10:03:00
 */
public class Solution3 {
    /**
     * 枚举法
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        char[] charArr = s.toCharArray();
        int maxSize = 0;
        for(int i=0;i<charArr.length-1;i++){
            char leftWord = charArr[i];
            Set<Character> charSet = new HashSet();
            charSet.add(leftWord);
            int comboCount = 1;
            for(int j=i+1;j<charArr.length;j++){
                if(charSet.contains(charArr[j])){
                    break;
                }else{
                    comboCount++;
                }
                charSet.add(charArr[j]);
            }
            if(comboCount>maxSize){
                maxSize = comboCount;
            }
        }
        return maxSize;
    }
}
