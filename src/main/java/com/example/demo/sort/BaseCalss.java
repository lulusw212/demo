package com.example.demo.sort;

public class BaseCalss {
   public static  int[] numbs ={9,8,3,7,6,5,4};
   //交换值
   public static void exch(int[] args ,int i,int j){
      int temp = args[i];
      args[i]=args[j];
      args[j]=temp;
   }
}
