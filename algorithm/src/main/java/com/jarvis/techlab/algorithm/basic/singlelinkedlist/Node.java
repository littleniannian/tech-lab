package com.jarvis.techlab.algorithm.basic.singlelinkedlist;

import java.util.Objects;

/**
 * @author jarvis.yuen
 * @version 1.0.0
 * @ClassName Node.java
 * @Description 链表数据结构
 * @createTime 2022年03月02日 16:39:00
 */
public class Node {
    protected int val;
    protected Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return getVal() == node.getVal() && Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVal(), getNext());
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
