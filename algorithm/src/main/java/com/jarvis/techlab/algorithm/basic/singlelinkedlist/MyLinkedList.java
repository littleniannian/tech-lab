package com.jarvis.techlab.algorithm.basic.singlelinkedlist;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName MyLinkedList.java
 * @createTime 2022年03月02日 16:42:00
 */
public class MyLinkedList {

    public Node addNode(Node head,Node newNode){
        if(head == null){
            head = newNode;
            return head;
        }
        Node tempNode = head;
        while (null != tempNode.next){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        return tempNode;
    }

    public void traverse(Node head){
        while (null!=head){
            head = head.next;
            if(null!=head){
                System.out.println(head.val);
            }
        }
    }
}
