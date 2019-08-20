package com.example.demo.sort;

import com.alibaba.fastjson.JSONObject;


public class QuickSort extends BaseCalss {

    public static void quickSort(int[] arr){
        qsort(arr, 0, arr.length-1);
    }

    /**
     * ①. 从数列中挑出一个元素，称为"基准"（pivot）。
     * ②. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。
     *     在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
     *
     * ③. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
     * @param arr   待排序数组
     * @param low   左边界
     * @param high  右边界
     */
    private static void qsort(int[] arr, int low, int high){
        if (low < high){
            int pivot=partition(arr, low, high);        //将数组分为两部分
            qsort(arr, low, pivot-1);                   //递归排序左子数组
            qsort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];     //枢轴记录 靶点（都需要跟此值比较）
        System.out.println("pivot=" + pivot);
        while (low < high) {
            while (low < high && arr[high] >= pivot) high--;
            arr[low] = arr[high];//交换比枢轴小的记录到左端
            System.out.println("arr[low]=" + arr[low] + " low=" + low);
            System.out.println("arr[high]=" + arr[high] + " high=" + high);

            while (low < high && arr[low] <= pivot) low++;
            arr[high] = arr[low];           //交换比枢轴小的记录到右端
            high--;
            System.out.println("low<high arr[low]=" + arr[low] + " low=" + low);
            System.out.println("low<high arr[high]=" + arr[high] + " high=" + high);
            //扫描完成，枢轴到位
            arr[low] = pivot;
            //返回的是枢轴的位置
        }
        return low;
    }

    private static int partitionfor(int[] arr, int low, int high) {
        int pivot = arr[low];     //枢轴记录 靶点（都需要跟此值比较）
        System.out.println("pivot=" + pivot);
        int i=low,j;
        if(low<high){
            //选取low做靶点，所以要比较靶点后面的数据
            for( j=low+1;j<=high;j++){
                if(arr[j]<pivot){
                    int temp = arr[j];
                    arr[j]=arr[i+1];
                    arr[i+1]=temp;
                    i++;
                }
            }
        }
        arr[low]= arr[i];
        arr[i]=pivot;
        return i;
    }

    private static void qsortfor(int[] arr, int low, int high){
        if (low < high){
            int pivot=partitionfor(arr, low, high);        //将数组分为两部分
            qsort(arr, low, pivot-1);                   //递归排序左子数组
            qsort(arr, pivot+1, high);                  //递归排序右子数组
        }
    }
    public static void quickSortfor(int[] arr){
        qsortfor(arr, 0, arr.length-1);
    }

    public static void main(String args[]){
        quickSortfor(numbs);
        System.out.println(JSONObject.toJSONString(numbs));

    }

}
