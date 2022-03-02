package com.jarvis.techlab.algorithm.basic.singlelinkedlist;

import org.junit.jupiter.api.Test;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName MyLinkedListTest.java
 * @createTime 2022年03月02日 17:02:00
 */
class MyLinkedListTest {
    @Test
    public void traverseTest(){
        MyLinkedList myLinkedList = new MyLinkedList();
        Node head = new Node(-1,null);
        for (int i = 0; i <10 ; i++) {
            myLinkedList.addNode(head,new Node(i,null));
        }
        myLinkedList.traverse(head);
    }
}