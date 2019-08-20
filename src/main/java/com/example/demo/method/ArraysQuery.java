package com.example.demo.method;

public class ArraysQuery {

    //查找有序二维数组(左下角开始查询)
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int i = row-1;
        int col = array[0].length;
        int j = 0;
        while(i>=0 && j<col){
            if(target>array[i][j]){
                j++;
            }else if(target<array[i][j]){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }
}
