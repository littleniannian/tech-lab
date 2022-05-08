package com.jarvis.techlab.algorithm;

import com.jarvis.techlab.algorithm.basic.tree.TreeNode;
import com.jarvis.techlab.algorithm.leetcode.Solution3;
import com.jarvis.techlab.algorithm.leetcode.Solution94;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestExecutionListeners;

import java.util.List;

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

    @Test
    public void solution94Test(){
        Solution94 solution94 = new Solution94();
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
        List<Integer> res = solution94.inorderTraversal(root);

    }
}
