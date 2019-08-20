package com.example.demo.sort;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.Arrays;

/**
 * 冒泡排序原理是游标选择后，
 * 依次对比两位数大小
 *
 */
public class BubbleSort extends BaseCalss{



    public static void sort(int[] args){
        int temp = 0;
        int size = args.length;
        for(int i=0;i<size-1;i++){
            //最后一个肯定最大 所以每次循环不用对比之前运算完的位置了
            for(int j=0;j<size-1-i;j++){
                if(args[j]>args[j+1]){
                    temp = args[j];
                    args[j]=args[j+1];
                    args[j+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        sort(numbs);

        System.out.println(JSONObject.toJSONString(numbs));
    }

}
