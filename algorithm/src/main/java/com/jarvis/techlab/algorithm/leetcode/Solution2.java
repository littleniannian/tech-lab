package com.jarvis.techlab.algorithm.leetcode;

import com.jarvis.techlab.algorithm.basic.singlelinkedlist.Node;

/**
 * @ClassName Solution2.java
 * @Author jarvis.yuen
 * @Version 1.0.0
 * @CreateTime 2022-03-07 23:15:00
 */
public class Solution2 {
    public Node addTwoNumbers(Node l1,Node l2){
        int payload = 0;
        Node resNode = null;
        // 指针
        Node tempNode = null;
        int loopCount=0;
        int sum = 0;
        while(l1 !=null || l2!=null||payload>0){
            sum = (l1==null?0:l1.val)+(l2==null?0:l2.val)+payload;
            int remain = sum%10;
            payload = sum/10;
            if(loopCount == 0){
                resNode = new Node(remain);
                tempNode = resNode;
            }else {
                tempNode = tempNode.next = new Node(remain);
            }
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
            loopCount++;
        }
        return resNode;
    }
}
