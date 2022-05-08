package com.jarvis.techlab.algorithm.leetcode;

import com.jarvis.techlab.algorithm.basic.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jarvis
 * @version 1.0.0
 * @Description
 * @createTime 2022年03月15日 16:24:00
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
