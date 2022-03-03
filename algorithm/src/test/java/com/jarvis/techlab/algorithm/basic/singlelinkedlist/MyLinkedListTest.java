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
        myLinkedList.addNode(head,new Node(1,null));
        myLinkedList.addNode(head,new Node(2,null));
        myLinkedList.addNode(head,new Node(3,null));
        System.out.println(head);
    }

    @Test
    public void deleteTest(){
        MyLinkedList myLinkedList = new MyLinkedList();
        Node head = new Node(-1,null);
        for (int i = 0; i <10 ; i++) {
            myLinkedList.addNode(head,new Node(i,null));
        }
        myLinkedList.delete(head,3);
        myLinkedList.traverse(head);
    }

    @Test
    public void updateTest(){
        MyLinkedList myLinkedList = new MyLinkedList();
        Node head = new Node(-1,null);
        myLinkedList.update(head,2);
        System.out.println(head);
    }

    @Test
    public void nodeTest(){
        Node node = new Node(1);
        Node temp = node;
        temp.setVal(2);
        System.out.println(node);
    }

    @Test
    public void addTest(){
        int a = 1;
        Node b = new Node(2);
        add(a);
        node(b);
        System.out.println(a);
        System.out.println(b);
    }

    private void add(int origin){
        origin++;
    }

    private void node(Node node){
        node.val++;
    }
}
