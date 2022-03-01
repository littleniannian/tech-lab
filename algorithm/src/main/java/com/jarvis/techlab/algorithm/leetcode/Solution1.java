package com.jarvis.techlab.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution1.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2022-02-24 01:02:00
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        if(null == nums||nums.length==0){
            return new int[]{};
        }
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            Integer key = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(key,i);
        }
        return new int[]{};
    }
}
