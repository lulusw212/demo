package com.example.demo.List;

import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.List;

public class ReverseList {



    public static ListNode reverse(ListNode head){
        if(null == head){
            return null;
        }
        //反转后的新node
        ListNode newNode = null;
        //反转操作时，当前node
        ListNode currentNode = null;
        //循环链表，互换节点指针。先把头节点给设置成尾，每个节点依次替换指针，填充新的链表
        while (head != null){
            //将头节点赋值临时变量
            currentNode = head.next;
            //头节点指针指向临时变量
            head.next = newNode;
            //新的临时变量存储head值（每次循环都是存储当前head）
            newNode = head;
            //head值变成为节点值（将head逐级拆分）
            head = currentNode;
        }
        return newNode;
    }

    public static ListNode init(int len){
        //待初始化节点
        ListNode head = null;
        //赋值时临时的当前节点
        ListNode temp = null;

        for(int i = 1;i<=len;i++){
            System.out.println(i);
            //给head赋值
            if(null == head){
                head = new ListNode(i);
                continue;
            }
            //创建新的node节点
            ListNode node = new ListNode(i);
            //需要一个变量来做中间变量，转换node值
            temp = head;
            //此处是关键，循环节点找到最后一个节点
            while (null != temp.next){
                temp=temp.next;
            }
            //给最后一个节点赋值
            temp.next = node;
        }
        System.out.println(JSONObject.toJSONString(head));
        return head;
    }

    public static void main(String args[]){

        ListNode reverse = reverse(init(5));
        System.out.println(JSONObject.toJSONString(reverse));

        }

}
