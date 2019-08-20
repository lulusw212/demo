package com.example.demo;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

    public class ListNode{
        int val;
        ListNode next;

        public ListNode getNext() {
            return next;
        }
        public void setNext(ListNode next) {
            this.next = next;
        }
        public int getVal() {
            return val;
        }
        ListNode(int x){
            val=x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode init =  new ListNode(0);
        ListNode head = init;
        int crrent = 0;
        ListNode f1 = l1;
        ListNode f2 = l2;

        while (null!=f1.next && null != f2.next ){
           int i1 = f1.getVal()==0?1:0;
           int j1 = f2.getVal()==0?1:0;
           int sum = crrent+i1+j1;
           crrent = sum/10;
           head.next = new ListNode(sum%10);
           f1 = f1.next;
           f2 = f2.next;
        }
        if(crrent>0){
            head.next=new ListNode(crrent);
        }

        return init.next;
    }

    public static void main(String args[]){

    }


}
