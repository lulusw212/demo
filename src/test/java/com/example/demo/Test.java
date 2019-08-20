package com.example.demo;

public class Test {

    public static  void main(String args[]){
        float i = 40000;
        float end = (float) (40000*0.6);
        System.out.println(end);
        int j=0;
        while(true){
            j++;
            end =end+ (float) (end*0.1);
            System.out.println("第"+j+"次 end ="+end);
            if(end>=i){
                break;
            }
        }
    }
}
