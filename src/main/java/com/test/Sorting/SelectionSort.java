package com.test.Sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        int idx,tmp;
        for(int i=0;i<arr.length-1;i++){
            idx = i;
            for(int j=i;j<arr.length;j++){
                if(arr[idx]>arr[j]){
                    idx = j;
                }
            }
            tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }
}
