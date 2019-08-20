package com.example.demo.sort;

import com.alibaba.fastjson.JSONObject;

public class SelectSort extends BaseCalss {


   //选择坐标并交换
    public static void sort1(int[] args){
       int len =  args.length;
        //先选定一个元素，然后
        for(int i=0;i<len;i++){
            int temp = i;
            for (int j = i+1;j<len;j++){
                if(args[j]<args[temp]){
                    temp = j;
                }
            }
            exch(args,i,temp);
        }
    }
   // 选择元素值
    public static void sort2(int[] args){
        int len =  args.length;
        //先选定一个元素，然后
        for(int i=0;i<len;i++){
            for (int j = i+1;j<len;j++){
                if(args[j]<args[i]){
                    exch(args,i,j);
                }
            }
        }
    }

    // 选择元素值
    public static void sort2desc(int[] args){
        int len =  args.length;
        //先选定一个元素，然后
        for(int i=0;i<len;i++){
            for (int j = i+1;j<len;j++){
                if(args[j]>args[i]){
                    exch(args,i,j);
                }
            }
        }
    }


    public static void main(String args[]){
        sort2desc(numbs);
        System.out.println(JSONObject.toJSONString(numbs));
    }
}
