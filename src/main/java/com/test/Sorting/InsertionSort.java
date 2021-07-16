package com.test.Sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        int tmp,idx;
        for(int i=1;i<arr.length;i++){
            tmp = arr[i]; idx = i-1;
            while(idx>=0 && tmp<arr[idx]){
                arr[idx+1] = arr[idx];
                idx--;
            }
            arr[idx+1] = tmp;
        }
        return arr;
    }
}
