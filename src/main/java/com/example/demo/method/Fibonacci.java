package com.example.demo.method;

public class Fibonacci {


    public static int result(int n){
        if(n==0 ) return 0;
        if(n==1 ) return 1;
        int one = 0;
        int two = 1;
        int result=0;
        for(int i=2;i<=n;i++){
            result = one+two;
            one = two;
            two = result;
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(result(2));
    }
}
