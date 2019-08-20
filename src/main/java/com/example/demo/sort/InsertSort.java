package com.example.demo.sort;

import com.alibaba.fastjson.JSONObject;

/**
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 取出来一个数放到合适位置
 */
public class InsertSort extends BaseCalss{

    public static void sort(int[] arrays){
       int length =  arrays.length;
       //第一层获取一个游标
       for(int i=1;i<length;i++){
           int temp = arrays[i];
           System.out.println("temp="+temp+" i="+i);
           int j = i-1;
           //第二层获取元素进行比较
           for(;j>=0 && arrays[j]>temp;j-- ){
               //找到合适自己的位置
               System.out.println("arrays[j+1]="+arrays[j+1]+" arrays[j]="+arrays[j]);
               arrays[j+1]=arrays[j];
           }
//           System.out.println("j+1="+(j+1));
           //位置互换到最后了，需要给不满足条件的位置赋值
           arrays[j+1]=temp;
       }
    }

    public static void sort1(int[] a){
        int length =  a.length;

        for(int i = 1;i<length;i++){
            //使目标左侧分段的元素有序
            for(int j = i;j>0 && a[j]<a[j-1];j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void sort1desc(int[] a){
        int length =  a.length;

        for(int i = 1;i<length;i++){
            //使目标左侧分段的元素有序
            for(int j = i;j>0 && a[j]>a[j-1];j--){
                exch(a,j,j-1);
            }
        }
    }


    public static void main(String args[]){
        sort1desc(numbs);
        System.out.println(JSONObject.toJSONString(numbs));
    }

}
