package com.example.demo.sort;

import com.alibaba.fastjson.JSONObject;

public class ShellSort extends BaseCalss {
    //
    public static void sort(int[] a,int size){
      int len = a.length;
      int h =1;
      while (h<len/size) h = size*h +1;
      while (h >= 1){
          for(int i = h;i<len;i++){
            for(int j = i;j>=h && a[j]<a[j-h];j-=h){
                exch(a,j,j-h);
            }
          }
          System.out.println(JSONObject.toJSONString(a));
          System.out.println("pre:"+h);
          h = h/size;
          System.out.println("after:"+h);
      }
    }

    public static void main(String args[]){
        sort(numbs,3);
        System.out.println(JSONObject.toJSONString(numbs));
    }
}
