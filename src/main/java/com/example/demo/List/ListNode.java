package com.example.demo.List;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class ListNode {

    int data;
    ListNode pre;
    ListNode next;

    public ListNode(int data){
        this.data = data;
    }
    public ListNode(){

    }
    public ListNode(ListNode pre,ListNode next,int data){
        this.data = data;
        this.pre = pre;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getPre() {
        return pre;
    }

    public void setPre(ListNode pre) {
        this.pre = pre;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
