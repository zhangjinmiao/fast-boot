package com.zjm.sort_demo;

import java.util.Arrays;

/**
 * @className : SortDemo
 * @description: 十大排序算法
 * @author: zhangjm
 * @create: 2020-05-09 13:42
 **/
public class SortDemo {

    public static void bubbleSort(int [] arr) {

        // 临时变量
        int temp;
        // 是否交换
        boolean flag = false;
        for (int i=0;i<arr.length-1;i++) {
            for (int j=arr.length-1;j>i;j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,7,8,9,0};
        bubbleSort(arr);
        Arrays.asList(arr).stream().forEach(x-> System.out.println(x));


        String[] array = {"a", "b", "c", "d", "e"};
        Arrays.asList(array).stream().forEach(System.out::println);
    }

}
