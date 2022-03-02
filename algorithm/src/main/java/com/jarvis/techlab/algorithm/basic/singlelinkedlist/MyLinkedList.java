package com.jarvis.techlab.algorithm.basic.singlelinkedlist;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName MyLinkedList.java
 * @createTime 2022年03月02日 16:42:00
 */
@Slf4j
public class MyLinkedList {

    /**
     * 求单链表的长度
     * @param node
     * @return
     */
    public int length(Node node){
        int length = 0;
        Node head = node;
        while (head!=null){
            head = node.next;
            length++;
        }
        return length;
    }

    /**
     * 按序号查找
     * @param num 第几个
     * @return
     */
    public Node findByIdx(int num,Node node){
        Node temp = node;
        int j = 0;
        while (temp!=null&&j<num){
            j++;
            temp = node.next;
        }
        if(j==num){
            return temp;
        }
        return null;
    }

    /**
     * 按值查找
     * @param val
     * @param node
     * @return
     */
    public Node findByVal(int val,Node node){
        Node temp = node;
        while (temp!=null && temp.val!=val){
            temp = node.next;
        }
        return temp;
    }

    /**
     * 添加元素到单链表到尾部
     * @param head
     * @param newNode
     */
    public void addNode(Node head,Node newNode){
        Node temp = head;
        if(temp==null){
            head = newNode;
        }
        while (temp!=null){
            if(temp.next==null){
                break;
            }else{
                temp = temp.next;
            }
        }
        temp.next = newNode;
        head = temp;
    }

    /**
     * 遍历这个单链表
     * @param head
     */
    public void traverse(Node head){
        System.out.print(head.val+", ");
        while (head!=null){
            head = head.next;
            if(head!=null){
                System.out.print(head.val+", ");
            }
        }
    }
}
